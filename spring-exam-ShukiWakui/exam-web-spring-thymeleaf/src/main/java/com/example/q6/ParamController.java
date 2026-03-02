package com.example.q6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * リクエストパラメータ<code>linkTo</code>の値を見て、フォーワード先を切り替えなさい。
 * 以下のようになるようにしなさい。
 * 
 * <pre>
 * linkTo = "1"の時、遷移先は6/first.html。
 * linkTo = "2"の時、遷移先は6/second.html。
 * 1,2以外の場合は、RuntimeExceptionをthrowしてください。
 * </pre>
 */
@Controller
public class ParamController {
	@RequestMapping(value = "/q6")
	public String gotoq6(String linkTo) {
		if (linkTo.equals("1")) {
			return "6/first";
		} else if (linkTo.equals("2")) {
			return "6/second";
		} else {
			throw new RuntimeException();
		}

	}
}
