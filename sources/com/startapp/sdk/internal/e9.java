package com.startapp.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.ImpressionsTrackingMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class e9 implements j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f40929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TrackingParams f40930c;
    public final Map d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f40931e;
    public AtomicReference f;
    public String g;

    public e9(Context context, List list, TrackingParams trackingParams, g5 g5Var) {
        this.f40928a = context;
        this.f40929b = list;
        this.f40930c = trackingParams;
        this.d = Collections.synchronizedMap(new LinkedHashMap(list.size()));
        this.f40931e = new AtomicInteger(list.size());
    }

    @Override // com.startapp.sdk.internal.j7
    public final Object a(Object obj, Object obj2, Object obj3) {
        Pair pair;
        String str = (String) obj;
        Throwable cause = (Throwable) obj3;
        if (((t8) obj2) != null) {
            pair = new Pair(4, String.valueOf(200));
        } else if (cause instanceof SDKException) {
            SDKException sDKException = (SDKException) cause;
            if (sDKException.a() > 0) {
                pair = new Pair(1, String.valueOf(sDKException.a()));
            } else {
                cause = cause.getCause();
                pair = null;
            }
        } else {
            pair = null;
        }
        if (pair == null) {
            pair = cause != null ? new Pair(2, cause.getClass().getName()) : new Pair(2, String.valueOf(-1));
        }
        this.d.put(str, pair);
        a();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Context context, List list, TrackingParams trackingParams) {
        e9 e9Var = (e9) ((j7) com.startapp.sdk.components.a.a(context).O.a()).a(context, list, trackingParams);
        if (e9Var != null) {
            vi.a(4, e9Var.f40928a, "Sending impression");
            for (String string : e9Var.f40929b) {
                if (string != null && string.length() > 0) {
                    if (e9Var.g == null) {
                        e9Var.g = h0.a(string, (String) null);
                    }
                    Context context2 = e9Var.f40928a;
                    TrackingParams trackingParams2 = e9Var.f40930c;
                    if (vi.d(string)) {
                        StringBuilder sb = new StringBuilder(string);
                        String strA = h0.a(string, (String) null);
                        if (strA != null) {
                            sb.append(AbstractC3396g.a(AbstractC3396g.c(strA)));
                        }
                        if (trackingParams2 != null) {
                            sb.append(trackingParams2.e());
                        }
                        string = sb.toString();
                    }
                    Pair pair = new Pair(string, Boolean.valueOf(ji.a(context2, string, e9Var)));
                    String str = (String) pair.first;
                    boolean zEquals = Boolean.TRUE.equals(pair.second);
                    e9Var.d.put(str, null);
                    if (!zEquals) {
                        e9Var.a();
                    }
                } else {
                    e9Var.d.put(string, null);
                    e9Var.a();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        String name;
        if (this.f40931e.decrementAndGet() == 0) {
            AtomicReference atomicReference = this.f;
            if (atomicReference == null) {
                ImpressionsTrackingMetadata impressionsTrackingMetadataC = MetaData.E().C();
                if (impressionsTrackingMetadataC == null || impressionsTrackingMetadataC.a() <= Math.random()) {
                    impressionsTrackingMetadataC = null;
                }
                AtomicReference atomicReference2 = new AtomicReference(impressionsTrackingMetadataC);
                this.f = atomicReference2;
                atomicReference = atomicReference2;
            }
            ImpressionsTrackingMetadata impressionsTrackingMetadata = (ImpressionsTrackingMetadata) atomicReference.get();
            if (impressionsTrackingMetadata != null) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                String str = "";
                boolean z2 = false;
                for (Map.Entry entry : this.d.entrySet()) {
                    Integer num = entry.getValue() != null ? (Integer) ((Pair) entry.getValue()).first : 2;
                    if (num != null && (impressionsTrackingMetadata.b() & num.intValue()) == num.intValue()) {
                        String strValueOf = entry.getValue() != null ? (String) ((Pair) entry.getValue()).second : String.valueOf(-2);
                        String str2 = (String) entry.getKey();
                        sb.append(str);
                        sb.append(strValueOf);
                        sb2.append(str);
                        if (str2 != null) {
                            try {
                                Uri uri = Uri.parse(str2);
                                name = uri.getAuthority() + uri.getPath();
                            } catch (Throwable th) {
                                name = th.getClass().getName();
                            }
                        } else {
                            name = String.valueOf((char[]) null);
                        }
                        sb2.append(name);
                        str = ",";
                        z2 = true;
                    }
                }
                if (z2) {
                    g9 g9Var = new g9(h9.k);
                    g9Var.f41002e = ((Object) sb) + ";" + ((Object) sb2);
                    g9Var.g = this.g;
                    StringBuilder sb3 = new StringBuilder("adTag: ");
                    TrackingParams trackingParams = this.f40930c;
                    sb3.append(trackingParams != null ? trackingParams.a() : null);
                    g9Var.d = sb3.toString();
                    g9Var.a();
                }
            }
        }
    }
}
