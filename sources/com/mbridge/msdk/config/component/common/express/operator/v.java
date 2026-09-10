package com.mbridge.msdk.config.component.common.express.operator;

import android.util.JsonReader;
import android.util.Log;
import cc.k0;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Optional;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31937a;

    public /* synthetic */ v(int i10) {
        this.f31937a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f31937a) {
            case 0:
                return ((String) obj).toLowerCase();
            case 1:
                return ((String) obj).toUpperCase();
            case 2:
                File file = (File) obj;
                try {
                    dc.a aVar = fc.d.f40771g;
                    String strF = fc.d.f(file);
                    aVar.getClass();
                    try {
                        JsonReader jsonReader = new JsonReader(new StringReader(strF));
                        try {
                            k0 k0VarH = dc.a.h(jsonReader);
                            jsonReader.close();
                            return Optional.of(k0VarH);
                        } catch (Throwable th2) {
                            try {
                                jsonReader.close();
                                break;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (IllegalStateException e10) {
                        throw new IOException(e10);
                    }
                } catch (IOException e11) {
                    Log.w("FirebaseCrashlytics", "Unable to read the Profiling Manager file ", e11);
                    return Optional.empty();
                }
            case 3:
                return com.mbridge.msdk.config.dynamic.binddata.wrapper.a.a((String) obj);
            default:
                String name = ((File) obj).getName();
                name.getClass();
                if (name.equals("trigger-type-anomaly")) {
                    return 8;
                }
                return !name.equals("trigger-type-oom") ? 0 : 7;
        }
    }
}
