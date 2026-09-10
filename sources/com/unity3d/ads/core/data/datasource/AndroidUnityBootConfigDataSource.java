package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.applovin.shadow.okio.Segment;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.n;
import qk.i0;
import t9.e;
import wj.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidUnityBootConfigDataSource;", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getValue", "", X3.i.W, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {
    private final Context context;

    public AndroidUnityBootConfigDataSource(Context context) {
        n.f(context, "context");
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    public String getValue(String key) {
        Object objC;
        n.f(key, "key");
        try {
            String strConcat = key.concat(X3.j.f27830b);
            c0 c0Var = new c0();
            InputStream stream = this.context.getAssets().open("bin/Data/boot.config");
            try {
                n.e(stream, "stream");
                e.j(new BufferedReader(new InputStreamReader(stream, an.a.f3768a), Segment.SIZE), new AndroidUnityBootConfigDataSource$getValue$1$1$1(strConcat, c0Var));
                stream.close();
                objC = (String) c0Var.f44760a;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(stream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            objC = e.c(th4);
        }
        if (objC instanceof g) {
            objC = null;
        }
        return (String) objC;
    }
}
