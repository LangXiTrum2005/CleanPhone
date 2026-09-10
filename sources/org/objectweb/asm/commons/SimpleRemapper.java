package org.objectweb.asm.commons;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class SimpleRemapper extends Remapper {
    private final Map<String, String> mapping;

    public SimpleRemapper(Map<String, String> map) {
        this.mapping = map;
    }

    @Override // org.objectweb.asm.commons.Remapper
    public String map(String str) {
        return this.mapping.get(str);
    }

    @Override // org.objectweb.asm.commons.Remapper
    public String mapAnnotationAttributeName(String str, String str2) {
        String map = map(str + '.' + str2);
        return map == null ? str2 : map;
    }

    @Override // org.objectweb.asm.commons.Remapper
    public String mapFieldName(String str, String str2, String str3) {
        String map = map(str + '.' + str2);
        return map == null ? str2 : map;
    }

    @Override // org.objectweb.asm.commons.Remapper
    public String mapInvokeDynamicMethodName(String str, String str2) {
        String map = map('.' + str + str2);
        return map == null ? str : map;
    }

    @Override // org.objectweb.asm.commons.Remapper
    public String mapMethodName(String str, String str2, String str3) {
        String map = map(str + '.' + str2 + str3);
        return map == null ? str2 : map;
    }

    public SimpleRemapper(String str, String str2) {
        this.mapping = Collections.singletonMap(str, str2);
    }
}
