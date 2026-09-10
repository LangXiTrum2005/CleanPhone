package com.smartdigimkt.t7;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.smartdigimkt.n8.c;
import com.smartdigimkt.sdk.api.IntegrationCheckListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class b implements com.smartdigimkt.t7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38752a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f38753b = null;

    public class a implements Runnable {
        final /* synthetic */ Map X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ Context f38754Y;
        final /* synthetic */ IntegrationCheckListener Z;

        public a(Map map, Context context, IntegrationCheckListener integrationCheckListener) {
            this.X = map;
            this.f38754Y = context;
            this.Z = integrationCheckListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.a(new HashMap(this.X));
            } catch (Throwable unused) {
            }
            b bVar = b.this;
            String strA = bVar.a(this.f38754Y, bVar.b(), com.smartdigimkt.m6.b.p().i());
            String unused2 = b.this.f38752a;
            TextUtils.isEmpty(strA);
            if (this.Z != null) {
                if (TextUtils.isEmpty(strA)) {
                    b.this.f38753b = "";
                    this.Z.onValidationSucceed();
                } else {
                    b.this.f38753b = androidx.datastore.preferences.protobuf.a.n("The ", strA, " resources are missing, If shrinkResources is enabled, the ", strA, " resources must be added to the whitelist (keep.xml)");
                    this.Z.onValidationFail(b.this.f38753b);
                }
            }
        }
    }

    public List<String> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sdm_myoffer_full_screen");
        arrayList.add("sdm_myoffer_splash_ad_layout_asseblem_vertical_port");
        return arrayList;
    }

    @Override // com.smartdigimkt.t7.a
    public void a(Context context, Map<String, Object> map, IntegrationCheckListener integrationCheckListener) {
        if (this.f38753b == null) {
            com.smartdigimkt.l7.b.a().g(new a(map, context, integrationCheckListener));
        } else if (integrationCheckListener != null) {
            if (TextUtils.isEmpty(this.f38753b)) {
                integrationCheckListener.onValidationSucceed();
            } else {
                integrationCheckListener.onValidationFail(this.f38753b);
            }
        }
    }

    @Override // com.smartdigimkt.t7.a
    public String a() {
        return this.f38753b;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae A[RETURN] */
    public String a(Context context, List<String> list, String str) {
        String str2;
        if (list == null || list.size() == 0) {
            return "";
        }
        boolean z2 = false;
        try {
            int size = list.size();
            str2 = "";
            boolean z3 = true;
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    String str3 = list.get(i2);
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = str3.split("_")[0] + "_*";
                        }
                        int identifier = !TextUtils.isEmpty(str) ? context.getResources().getIdentifier(str3, "layout", str) : -1;
                        if (identifier <= 0) {
                            identifier = context.getResources().getIdentifier(str3, "layout", context.getPackageName());
                        }
                        if (identifier <= 0) {
                            if (z2) {
                                return "";
                            }
                            return str2;
                        }
                        XmlResourceParser layout = null;
                        try {
                            layout = context.getResources().getLayout(identifier);
                            while (true) {
                                int next = layout.next();
                                if (next == 1) {
                                    break;
                                }
                                if (next == 2) {
                                    if ("x".equalsIgnoreCase(layout.getName())) {
                                        if (layout.getAttributeCount() == 0) {
                                            z3 = false;
                                            break;
                                        }
                                    } else if (layout.getAttributeCount() >= 0) {
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                th.printStackTrace();
                                if (layout != null) {
                                    break;
                                }
                            } catch (Throwable th2) {
                                if (layout != null) {
                                    layout.close();
                                }
                                throw th2;
                            }
                        }
                        layout.close();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th.printStackTrace();
                }
            }
            z2 = z3;
        } catch (Throwable th4) {
            th = th4;
            str2 = "";
        }
        if (z2) {
            return "";
        }
        return str2;
    }
}
