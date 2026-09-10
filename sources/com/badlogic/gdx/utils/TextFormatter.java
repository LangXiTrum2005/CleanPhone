package com.badlogic.gdx.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.text.MessageFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class TextFormatter {
    private StringBuilder buffer = new StringBuilder();
    private MessageFormat messageFormat;

    public TextFormatter(Locale locale, boolean z) {
        if (z) {
            this.messageFormat = new MessageFormat("", locale);
        }
    }

    private String replaceEscapeChars(String str) {
        int i = 0;
        this.buffer.setLength(0);
        int length = str.length();
        boolean z = false;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\'') {
                this.buffer.append("''");
                z = true;
            } else if (cCharAt == '{') {
                int i2 = i + 1;
                while (i2 < length && str.charAt(i2) == '{') {
                    i2++;
                }
                int i3 = i2 - i;
                int i4 = i3 / 2;
                if (i4 > 0) {
                    this.buffer.append('\'');
                    do {
                        this.buffer.append('{');
                        i4--;
                    } while (i4 > 0);
                    this.buffer.append('\'');
                    z = true;
                }
                if (i3 % 2 != 0) {
                    this.buffer.append('{');
                }
                i = i2 - 1;
            } else {
                this.buffer.append(cCharAt);
            }
            i++;
        }
        return z ? this.buffer.toString() : str;
    }

    private String simpleFormat(String str, Object... objArr) {
        this.buffer.setLength(0);
        int length = str.length();
        int i = 0;
        int i2 = -1;
        boolean z = false;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (i2 < 0) {
                if (cCharAt == '{') {
                    int i3 = i + 1;
                    if (i3 >= length || str.charAt(i3) != '{') {
                        i2 = 0;
                    } else {
                        this.buffer.append(cCharAt);
                        i = i3;
                    }
                    z = true;
                } else {
                    this.buffer.append(cCharAt);
                }
            } else if (cCharAt == '}') {
                if (i2 >= objArr.length) {
                    throw new IllegalArgumentException(AbstractC3950lJ.p("Argument index out of bounds: ", i2));
                }
                if (str.charAt(i - 1) == '{') {
                    throw new IllegalArgumentException("Missing argument index after a left curly brace");
                }
                Object obj = objArr[i2];
                if (obj == null) {
                    this.buffer.append("null");
                } else {
                    this.buffer.append(obj.toString());
                }
                i2 = -1;
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    throw new IllegalArgumentException("Unexpected '" + cCharAt + "' while parsing argument index");
                }
                i2 = (i2 * 10) + (cCharAt - '0');
            }
            i++;
        }
        if (i2 < 0) {
            return z ? this.buffer.toString() : str;
        }
        throw new IllegalArgumentException("Unmatched braces in the pattern.");
    }

    public String format(String str, Object... objArr) {
        MessageFormat messageFormat = this.messageFormat;
        if (messageFormat == null) {
            return simpleFormat(str, objArr);
        }
        messageFormat.applyPattern(replaceEscapeChars(str));
        return this.messageFormat.format(objArr);
    }
}
