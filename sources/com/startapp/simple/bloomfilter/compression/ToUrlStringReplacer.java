package com.startapp.simple.bloomfilter.compression;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class ToUrlStringReplacer implements StringReplacer {
    private static final String DIEZ = "#";
    private static final String EQUALS = "=";
    private static final String PLUS = "+";
    private static final String PLUS_SAFE_REGEX = "\\+";
    private static final String SLASH = "/";
    private static final String STAR = "*";
    private static final String STAR_SAFE_REGEX = "\\*";
    private static final String UNDERSCORE = "_";
    private final Pattern patternPlus = Pattern.compile(PLUS_SAFE_REGEX);
    private final Pattern patternSlash = Pattern.compile(SLASH);
    private final Pattern patternEquals = Pattern.compile("=");
    private final Pattern patternUnderscore = Pattern.compile(UNDERSCORE);
    private final Pattern patternStartSafeRegex = Pattern.compile(STAR_SAFE_REGEX);
    private final Pattern patternDiez = Pattern.compile(DIEZ);

    @Override // com.startapp.simple.bloomfilter.compression.StringReplacer
    public String replaceFromUrl(String str) {
        return this.patternDiez.matcher(this.patternStartSafeRegex.matcher(this.patternUnderscore.matcher(str).replaceAll(PLUS)).replaceAll(SLASH)).replaceAll("=");
    }

    @Override // com.startapp.simple.bloomfilter.compression.StringReplacer
    public String replaceToUrl(String str) {
        return this.patternEquals.matcher(this.patternSlash.matcher(this.patternPlus.matcher(str).replaceAll(UNDERSCORE)).replaceAll(STAR)).replaceAll(DIEZ);
    }
}
