package com.smartdigimkt.h8;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
class d implements com.smartdigimkt.i8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f35740a = "FastKV";

    @Override // com.smartdigimkt.i8.c
    public void a(String str, String str2) {
        Log.i(f35740a, str + " " + str2);
    }

    @Override // com.smartdigimkt.i8.c
    public void b(String str, Exception exc) {
        Log.e(f35740a, str, exc);
    }

    @Override // com.smartdigimkt.i8.c
    public void a(String str, Exception exc) {
        Log.w(f35740a, str, exc);
    }
}
