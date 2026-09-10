package com.startapp.sdk.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f41207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f41208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f41209c;
    public String d;

    public final l9 a(String... strArr) {
        ArrayList arrayList = this.f41209c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f41209c = arrayList;
        }
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str);
            }
        }
        return this;
    }
}
