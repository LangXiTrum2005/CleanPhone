package ld;

import a7.l;
import android.content.Context;
import com.google.protobuf.Internal;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.util.Random;
import nd.k0;
import nd.m0;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd.a f45289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f45290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f45291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f45292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f45293e;

    public d(Context context, l lVar) {
        jj.d dVar = new jj.d(23);
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        dd.a aVarE = dd.a.e();
        this.f45292d = null;
        this.f45293e = null;
        boolean z10 = false;
        if (!(0.0d <= dNextDouble && dNextDouble < 1.0d)) {
            throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
        }
        if (0.0d <= dNextDouble2 && dNextDouble2 < 1.0d) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        }
        this.f45290b = dNextDouble;
        this.f45291c = dNextDouble2;
        this.f45289a = aVarE;
        this.f45292d = new c(lVar, dVar, aVarE, "Trace");
        this.f45293e = new c(lVar, dVar, aVarE, AndroidInitializeBoldSDK.MSG_NETWORK);
        i0.R(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Internal.ProtobufList protobufList) {
        return protobufList.size() > 0 && ((k0) protobufList.get(0)).k() > 0 && ((k0) protobufList.get(0)).j() == m0.GAUGES_AND_SYSTEM_EVENTS;
    }
}
