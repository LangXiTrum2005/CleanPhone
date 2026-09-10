package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9857b;

    public /* synthetic */ u9(Object obj, int i10) {
        this.f9856a = i10;
        this.f9857b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9856a;
        Object obj = this.f9857b;
        switch (i10) {
            case 0:
                ((n8.a) obj).b();
                break;
            case 1:
                ((q2.a) obj).a();
                break;
            case 2:
                ((r5.c) obj).a();
                break;
            case 3:
                ((y1.h) obj).a();
                break;
            case 4:
                ((a) obj).b();
                break;
            case 5:
                ((SharedPreferences.Editor) obj).commit();
                break;
            case 6:
                ((e1) obj).notifyDataSetChanged();
                break;
            case 7:
                ((e6) obj).e();
                break;
            case 8:
                ((g5) obj).c();
                break;
            case 9:
                ((h6) obj).e();
                break;
            case 10:
                i1.b((Context) obj);
                break;
            case 11:
                ((i6) obj).e();
                break;
            case 12:
                ((n8) obj).a();
                break;
            case 13:
                ((o5) obj).e();
                break;
            case 14:
                ((q3) obj).notifyDataSetChanged();
                break;
            default:
                ((u2) obj).notifyDataSetChanged();
                break;
        }
    }
}
