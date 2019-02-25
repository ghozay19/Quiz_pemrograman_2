package com.ghozay19.quizzzz;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by {$user} on 25/02/2019.
 * at 10:17
 * Copyright (c) 2019 Naghom Dev All rights reserved.
 */
public class FormatterUtil {

    public static final String DECIMAL_FORMAT = "#,###,###,###,##0.00";



    public static String bigDecimalFormat(BigDecimal number) {
        try {
            DecimalFormat formatter = new DecimalFormat(DECIMAL_FORMAT);
            return formatter.format(number);
        } catch (Exception e) {
            return "-";
        }
    }
}
