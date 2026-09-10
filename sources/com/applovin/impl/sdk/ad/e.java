package com.applovin.impl.sdk.ad;

import com.applovin.impl.j5;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f9385b;

    public /* synthetic */ e(b bVar, int i10) {
        this.f9384a = i10;
        this.f9385b = bVar;
    }

    @Override // s.a
    public final Object apply(Object obj) {
        int i10 = this.f9384a;
        b bVar = this.f9385b;
        switch (i10) {
            case 0:
                return bVar.j((j5) obj);
            case 1:
                return bVar.g((j5) obj);
            case 2:
                return bVar.k((j5) obj);
            case 3:
                return bVar.e((j5) obj);
            case 4:
                return bVar.b((j5) obj);
            case 5:
                return bVar.f((j5) obj);
            case 6:
                return bVar.a((JSONArray) obj);
            case 7:
                return bVar.c((j5) obj);
            case 8:
                return bVar.a((j5) obj);
            case 9:
                return bVar.m((j5) obj);
            case 10:
                return bVar.i((j5) obj);
            default:
                return bVar.d((j5) obj);
        }
    }
}
