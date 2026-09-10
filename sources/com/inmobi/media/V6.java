package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class V6 extends AbstractC3230se {
    public final byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3333z5 f23298e;
    public final WeakReference f;
    public short g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f23299h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6(S0 adUnit, C2969ca oAManager, byte[] response, InterfaceC3333z5 interfaceC3333z5) {
        super(adUnit, (byte) 3);
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(oAManager, "oAManager");
        Intrinsics.f(response, "response");
        this.d = response;
        this.f23298e = interfaceC3333z5;
        this.f = new WeakReference(oAManager);
    }

    @Override // com.inmobi.media.AbstractC3230se
    public final void a(Object obj) {
        C3312y0 c3312y0 = (C3312y0) obj;
        InterfaceC3333z5 interfaceC3333z5 = this.f23298e;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("LoadWithResponseWorker", "onComplete");
        }
        C2969ca c2969ca = (C2969ca) this.f.get();
        if (c2969ca == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23298e;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("LoadWithResponseWorker", "oAManager is null");
                return;
            }
            return;
        }
        if (c3312y0 != null) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23298e;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).c("LoadWithResponseWorker", "loading response");
            }
            c2969ca.f23493a.b(c3312y0);
            return;
        }
        short s = this.g;
        if (s != 0) {
            HashMap mapG = MapsKt.g(new Pair("errorCode", Short.valueOf(s)));
            String str = this.f23299h;
            if (str != null) {
                mapG.put("reason", str);
            }
            c2969ca.f23493a.b((Map<String, Object>) mapG);
        }
        c2969ca.f23493a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        InterfaceC3333z5 interfaceC3333z8 = this.f23298e;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).b("LoadWithResponseWorker", "adSet null. fail with error code - " + ((int) this.g));
        }
    }

    @Override // com.inmobi.media.G1
    public final void c() {
        S0 s0;
        super.c();
        InterfaceC3333z5 interfaceC3333z5 = this.f23298e;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b("LoadWithResponseWorker", "Encountered OOM");
        }
        C2969ca c2969ca = (C2969ca) this.f.get();
        if (c2969ca == null || (s0 = c2969ca.f23493a) == null) {
            return;
        }
        s0.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (short) 2146);
    }

    @Override // com.inmobi.media.G1
    public final void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23298e;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("LoadWithResponseWorker", "execute task start");
        }
        C2969ca c2969ca = (C2969ca) this.f.get();
        if (c2969ca == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23298e;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("LoadWithResponseWorker", "OAManager null. failing.");
            }
            this.g = (short) 2142;
            b(null);
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f23298e;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).a("LoadWithResponseWorker", "getting network response from byte array");
        }
        byte[] response = this.d;
        Intrinsics.f(response, "response");
        P9 p9 = new P9();
        if (response.length == 0) {
            p9.f23071b = new byte[0];
        } else {
            byte[] bArr = new byte[response.length];
            p9.f23071b = bArr;
            System.arraycopy(response, 0, bArr, 0, response.length);
        }
        I9 i9 = p9.d;
        if (i9 != null) {
            switch (U.f23240a[i9.f22886a.ordinal()]) {
                case 1:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
                    break;
                case 2:
                    InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID);
                    I9 i10 = p9.d;
                    String str = i10 != null ? i10.f22887b : null;
                    if (str != null) {
                        inMobiAdRequestStatus.setCustomMessage(str);
                    }
                    break;
                case 3:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.SERVER_ERROR);
                    break;
                case 9:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED);
                    break;
                default:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
                    break;
            }
        }
        try {
            InterfaceC3333z5 interfaceC3333z8 = this.f23298e;
            if (interfaceC3333z8 != null) {
                ((A5) interfaceC3333z8).a("LoadWithResponseWorker", "start parsing response");
            }
            JSONObject jSONObject = new JSONObject(p9.a());
            long j = jSONObject.getLong("placementId");
            InterfaceC3333z5 interfaceC3333z9 = this.f23298e;
            if (interfaceC3333z9 != null) {
                ((A5) interfaceC3333z9).e("placementID", String.valueOf(j));
            }
            InterfaceC3333z5 interfaceC3333z10 = this.f23298e;
            if (interfaceC3333z10 != null) {
                ((A5) interfaceC3333z10).a("LoadWithResponseWorker", "placement id: " + j);
            }
            B0 b0P = c2969ca.f23493a.p();
            b0P.getClass();
            b(b0P.a(jSONObject));
        } catch (K e2) {
            this.g = e2.f22912b;
            InterfaceC3333z5 interfaceC3333z11 = this.f23298e;
            if (interfaceC3333z11 != null) {
                String strE = S0.e();
                Intrinsics.e(strE, "<get-TAG>(...)");
                ((A5) interfaceC3333z11).a(strE, "Exception while parsing OAResponse", e2);
            }
            b(null);
        } catch (JSONException e3) {
            this.g = (short) 2145;
            this.f23299h = e3.getMessage();
            InterfaceC3333z5 interfaceC3333z12 = this.f23298e;
            if (interfaceC3333z12 != null) {
                String strE2 = S0.e();
                Intrinsics.e(strE2, "<get-TAG>(...)");
                ((A5) interfaceC3333z12).a(strE2, "Exception while parsing OAResponse", e3);
            }
            b(null);
        }
    }
}
