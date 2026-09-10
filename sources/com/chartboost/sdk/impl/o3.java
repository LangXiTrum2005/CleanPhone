package com.chartboost.sdk.impl;

import java.io.File;
import java.net.URL;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public interface o3 {
    File a();

    File a(File file);

    File a(URL url);

    Object a(File file, File file2, Continuation continuation);

    Object a(File file, Continuation continuation);

    Object a(URL url, l3 l3Var, Continuation continuation);

    Object a(URL url, Continuation continuation);

    Object a(Continuation continuation);

    boolean a(long j);

    Object b(File file, File file2, Continuation continuation);

    Object b(File file, Continuation continuation);

    Object b(URL url, Continuation continuation);

    Object b(Continuation continuation);
}
