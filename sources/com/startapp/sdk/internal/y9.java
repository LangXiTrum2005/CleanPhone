package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.insight.NetworkTestsMetaData;

/* JADX INFO: loaded from: classes6.dex */
public final class y9 extends z9 {
    public final Context d;

    public y9(Context context, g9 g9Var, j9 j9Var, q9 q9Var) {
        super(g9Var, j9Var, q9Var);
        this.d = context;
    }

    @Override // com.startapp.sdk.internal.z9
    public final int a() {
        x9 x9Var = new x9(this.f41764a);
        x9Var.c(this.d);
        String str = this.f41764a.f41001c;
        if (str != null && str.length() > 0) {
            x9Var.f41744c = str;
        }
        if ((this.f41765b.f41137b & 32) != 0) {
            try {
                com.startapp.sdk.adsbase.g.e(this.d);
            } catch (Throwable th) {
                if (this.f41764a.f40999a != h9.f) {
                    g9.a(th);
                }
            }
        }
        if ((this.f41765b.f41137b & 8) != 0) {
            try {
                x9Var.n0 = ((mh) ((ph) com.startapp.sdk.components.a.a(this.d).f.a()).b()).a(6);
            } catch (Throwable th2) {
                if (this.f41764a.f40999a != h9.f) {
                    g9.a(th2);
                }
            }
        }
        String strE = null;
        if ((this.f41765b.f41137b & 1) != 0) {
            try {
                x9Var.b(this.d, null);
            } catch (Throwable th3) {
                if (this.f41764a.f40999a != h9.f) {
                    g9.a(th3);
                }
            }
        }
        if ((this.f41765b.f41137b & 2) != 0) {
            try {
                x9Var.d(this.d);
            } catch (Throwable th4) {
                if (this.f41764a.f40999a != h9.f) {
                    g9.a(th4);
                }
            }
        }
        if ((this.f41765b.f41137b & 4) != 0) {
            try {
                x9Var.e(this.d);
            } catch (Throwable th5) {
                if (this.f41764a.f40999a != h9.f) {
                    g9.a(th5);
                }
            }
        }
        if ((this.f41765b.f41137b & 16) != 0) {
            try {
                x9Var.a(this.d);
            } catch (Throwable th6) {
                if (this.f41764a.f40999a != h9.f) {
                    g9.a(th6);
                }
            }
        }
        if ((this.f41765b.f41137b & 1024) != 0) {
            try {
                x9Var.b(this.d);
            } catch (Throwable th7) {
                if (this.f41764a.f40999a != h9.f) {
                    g9.a(th7);
                }
            }
        }
        if ((this.f41765b.f41137b & 128) != 0) {
            try {
                String str2 = (String) ((m2) com.startapp.sdk.components.a.a(this.d).r.a()).b();
                if (str2 != null) {
                    x9Var.p0 = AbstractC3396g.b(str2);
                }
            } catch (Throwable th8) {
                if (this.f41764a.f40999a != h9.f) {
                    g9.a(th8);
                }
            }
        }
        if ((this.f41765b.f41137b & 256) != 0) {
            try {
                String str3 = (String) ((mg) com.startapp.sdk.components.a.a(this.d).s.a()).b();
                if (str3 != null) {
                    x9Var.o0 = AbstractC3396g.b(str3);
                }
            } catch (Throwable th9) {
                if (this.f41764a.f40999a != h9.f) {
                    g9.a(th9);
                }
            }
        }
        if ((this.f41765b.f41137b & 512) != 0) {
            try {
                x9Var.f41740Y = ((o0) com.startapp.sdk.components.a.a(this.d).f40742p.a()).a();
            } catch (Throwable th10) {
                if (this.f41764a.f40999a != h9.f) {
                    g9.a(th10);
                }
            }
        }
        if ((this.f41765b.f41137b & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0) {
            try {
                x9Var.q0 = ((yh) com.startapp.sdk.components.a.a(this.d).g.a()).a(this.f41764a.f40999a);
            } catch (Throwable th11) {
                if (this.f41764a.f40999a != h9.f) {
                    g9.a(th11);
                }
            }
        }
        try {
            x9Var.f41733J = ((hf) com.startapp.sdk.components.a.a(this.d).f40739i.a()).a(x9Var);
        } catch (Throwable th12) {
            if (this.f41764a.f40999a != h9.f) {
                g9.a(th12);
            }
        }
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        NetworkTestsMetaData networkTestsMetaDataL = MetaData.E().L();
        h9 h9Var = this.f41764a.f40999a;
        if (h9Var == h9.m) {
            if (networkTestsMetaDataL != null) {
                strE = networkTestsMetaDataL.a();
            }
        } else if (h9Var == h9.f41044n) {
            if (networkTestsMetaDataL != null) {
                strE = networkTestsMetaDataL.b();
            }
        } else if (h9Var == h9.o) {
            if (networkTestsMetaDataL != null) {
                strE = networkTestsMetaDataL.c();
            }
        } else if (h9Var == h9.f41042i) {
            strE = analyticsConfigH.e();
        }
        if (strE == null) {
            strE = analyticsConfigH.d();
        }
        q8 q8Var = (q8) com.startapp.sdk.components.a.a(this.d).f40741n.a();
        p8 p8Var = new p8(q8Var, strE);
        p8Var.f41355c = x9Var.a(((HttpClientConfig) q8Var.f.a()).e());
        p8Var.d = ((HttpClientConfig) q8Var.f.a()).a(x9Var.Z);
        return p8Var.b() != null ? 1 : 0;
    }
}
