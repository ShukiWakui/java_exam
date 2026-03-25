'use strict';

$(function(){
    // 問題１
    console.log('和久井柊希');

    // 問題２
    $('#name_btn').on('click', function(){
        $('#name').css('color', 'red');
    });

    // 問題３
    $('#age_btn').on('click', function(){
        alert($('#age').val());
    });

    // 問題４
    $('#one_click_btn').on('click', function(){
        $('#one_click_btn').prop('disabled', true);
    });

    // 問題５
    $('#output_sample').on('change', function(){
        let langage = $('#output_sample').val();
        if (langage === 'Java') {
            $('#output_sample_text').text('System.out.println("Hello World");');
        } else if (langage === 'JavaScript') {
            $('#output_sample_text').text('console.log("Hello World");');
        } else {
            $('#output_sample_text').text('');
        };
    });
})
