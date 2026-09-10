package com.thinkup.core.common.no.m.o.n;

import com.p004ironsource.ko;

/* JADX INFO: loaded from: classes6.dex */
public final class om {
    private om() {
    }

    public static boolean m(String str) {
        return str.equals(ko.f25535b) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean n(String str) {
        return (str.equals(ko.f25534a) || str.equals("HEAD")) ? false : true;
    }

    public static boolean o(String str) {
        return str.equals(ko.f25535b) || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    private static boolean o0(String str) {
        return str.equals("PROPFIND");
    }

    private static boolean oo(String str) {
        return !str.equals("PROPFIND");
    }
}
