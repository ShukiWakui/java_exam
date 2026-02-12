-- 問題１
INSERT INTO items(id, category_id, name, price) VALUES (13, 1, '鰯', 150);
INSERT INTO items(id, category_id, name, price) VALUES (14, 2, '羊', 650);

--問題２
UPDATE items
SET price = price * 0.9;

--問題３
DELETE FROM employees
WHERE end_date IS NOT NULL AND end_date < '2013-03-31';

--問題４
SELECT id, name, email, start_date, end_date
FROM employees
WHERE end_date IS NOT NULL AND start_date = (
	SELECT MIN(start_date)
	FROM employees
	WHERE end_date IS NOT NULL
);

--問題５
SELECT r.name AS "region", p.name AS "prefecture"
FROM prefectures p
JOIN regions r ON p.region_code = r.code;

--問題６
SELECT SUM(population) AS "population"
FROM populations;

--問題７
SELECT pre.name AS "prefecture", g.name AS "gender", SUM(pop.population) AS "population" 
FROM populations pop
LEFT JOIN prefectures pre ON pop.prefecture_code = pre.code
LEFT JOIN regions r ON pre.region_code = r.code
JOIN genders g ON pop.gender_code = g.code
WHERE r.name = '九州'
GROUP BY pre.name, pre.code, g.name, g.code
ORDER BY pre.code, g.code DESC;


--問題８
SELECT r.name AS "地域",
	SUM(CASE WHEN gene.label = '15歳未満' AND gend.name = '男' THEN pop.population ELSE 0 END) AS "15歳未満(男)",
	SUM(CASE WHEN gene.label = '15〜64歳' AND gend.name = '男' THEN pop.population ELSE 0 END) AS "15歳～64歳(男)",
	SUM(CASE WHEN gene.label = '65歳以上' AND gend.name = '男' THEN pop.population ELSE 0 END) AS "65歳以上(男)",
	SUM(CASE WHEN gene.label = '15歳未満' AND gend.name = '女' THEN pop.population ELSE 0 END) AS "15歳未満(女)",
	SUM(CASE WHEN gene.label = '15〜64歳' AND gend.name = '女' THEN pop.population ELSE 0 END) AS "15歳～ 64歳(女)",
	SUM(CASE WHEN gene.label = '65歳以上' AND gend.name = '女' THEN pop.population ELSE 0 END) AS "65歳以上(女)"
FROM populations pop
LEFT JOIN prefectures pre ON pop.prefecture_code = pre.code
LEFT JOIN regions r ON pre.region_code = r.code
LEFT JOIN genders gend ON pop.gender_code = gend.code
LEFT JOIN generations gene ON pop.generation_code = gene.code
GROUP BY r.name, r.code
ORDER BY r.code;
