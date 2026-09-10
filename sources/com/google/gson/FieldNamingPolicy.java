package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public enum FieldNamingPolicy implements FieldNamingStrategy {
    X { // from class: com.google.gson.FieldNamingPolicy.1
        @Override // com.google.gson.FieldNamingStrategy
        public final String a(Field field) {
            return field.getName();
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF9 { // from class: com.google.gson.FieldNamingPolicy.2
        @Override // com.google.gson.FieldNamingStrategy
        public final String a(Field field) {
            return FieldNamingPolicy.d(field.getName());
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF14 { // from class: com.google.gson.FieldNamingPolicy.3
        @Override // com.google.gson.FieldNamingStrategy
        public final String a(Field field) {
            return FieldNamingPolicy.d(FieldNamingPolicy.b(field.getName(), ' '));
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF19 { // from class: com.google.gson.FieldNamingPolicy.4
        @Override // com.google.gson.FieldNamingStrategy
        public final String a(Field field) {
            return FieldNamingPolicy.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF24 { // from class: com.google.gson.FieldNamingPolicy.5
        @Override // com.google.gson.FieldNamingStrategy
        public final String a(Field field) {
            return FieldNamingPolicy.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF29 { // from class: com.google.gson.FieldNamingPolicy.6
        @Override // com.google.gson.FieldNamingStrategy
        public final String a(Field field) {
            return FieldNamingPolicy.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF34 { // from class: com.google.gson.FieldNamingPolicy.7
        @Override // com.google.gson.FieldNamingStrategy
        public final String a(Field field) {
            return FieldNamingPolicy.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    public static String b(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String d(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i2 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
            }
        }
        return str;
    }
}
