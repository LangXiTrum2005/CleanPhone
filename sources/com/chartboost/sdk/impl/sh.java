package com.chartboost.sdk.impl;

import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f15142a = new Regex("^market://details\\?id=(.*)$");

    public static final String a(qh qhVar) {
        MatchResult matchResultA = f15142a.a(qhVar.b());
        if (matchResultA != null) {
            return (String) CollectionsKt.B(1, matchResultA.b());
        }
        return null;
    }

    public static final qh b(qh qhVar) {
        Intrinsics.f(qhVar, "<this>");
        String strA = a(qhVar);
        if (strA == null) {
            return qhVar;
        }
        qh qhVarA = qh.a(qhVar, String.format("https://play.google.com/store/apps/details?id=%s", Arrays.copyOf(new Object[]{strA}, 1)), null, false, 6, null);
        return qhVarA == null ? qhVar : qhVarA;
    }
}
