package com.google.android.material.color.utilities;

import com.chartboost.sdk.impl.l5;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19227b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f19226a = i2;
        this.f19227b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f19226a) {
            case 0:
                MaterialDynamicColors materialDynamicColors = (MaterialDynamicColors) this.f19227b;
                materialDynamicColors.e();
                materialDynamicColors.d();
                return new ToneDeltaPair();
            case 1:
                MaterialDynamicColors materialDynamicColors2 = (MaterialDynamicColors) this.f19227b;
                materialDynamicColors2.i();
                materialDynamicColors2.h();
                return new ToneDeltaPair();
            case 2:
                ((MaterialDynamicColors) this.f19227b).getClass();
                throw null;
            case 3:
                MaterialDynamicColors materialDynamicColors3 = (MaterialDynamicColors) this.f19227b;
                materialDynamicColors3.g();
                materialDynamicColors3.f();
                return new ToneDeltaPair();
            case 4:
                MaterialDynamicColors materialDynamicColors4 = (MaterialDynamicColors) this.f19227b;
                materialDynamicColors4.e();
                materialDynamicColors4.d();
                return new ToneDeltaPair();
            case 5:
                return ((MaterialDynamicColors) this.f19227b).d();
            case 6:
                return ((MaterialDynamicColors) this.f19227b).a();
            case 7:
                return ((MaterialDynamicColors) this.f19227b).e();
            case 8:
                MaterialDynamicColors materialDynamicColors5 = (MaterialDynamicColors) this.f19227b;
                materialDynamicColors5.i();
                materialDynamicColors5.h();
                return new ToneDeltaPair();
            case 9:
                return ((MaterialDynamicColors) this.f19227b).f();
            case 10:
                MaterialDynamicColors materialDynamicColors6 = (MaterialDynamicColors) this.f19227b;
                materialDynamicColors6.g();
                materialDynamicColors6.f();
                return new ToneDeltaPair();
            case 11:
                return ((MaterialDynamicColors) this.f19227b).h();
            case 12:
                return ((MaterialDynamicColors) this.f19227b).i();
            case 13:
                return ((MaterialDynamicColors) this.f19227b).g();
            case 14:
                MaterialDynamicColors materialDynamicColors7 = (MaterialDynamicColors) this.f19227b;
                materialDynamicColors7.b();
                materialDynamicColors7.a();
                return new ToneDeltaPair();
            case 15:
                return ((MaterialDynamicColors) this.f19227b).b();
            case 16:
                MaterialDynamicColors materialDynamicColors8 = (MaterialDynamicColors) this.f19227b;
                materialDynamicColors8.b();
                materialDynamicColors8.a();
                return new ToneDeltaPair();
            default:
                return l5.a((l5.a) this.f19227b, obj);
        }
    }
}
