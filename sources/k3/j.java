package k3;

import android.util.Log;
import b2.d0;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener;
import com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetails;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.UserChoiceBillingListener;
import com.android.billingclient.api.UserChoiceDetails;
import com.google.android.gms.internal.ads.s2;
import com.google.android.gms.internal.ads.xx1;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.B5;
import com.ironsource.C0375hc;
import com.mbridge.msdk.foundation.download.Command;
import com.storage.androidcleaner.activity.TrashConsentActivity;
import com.unity3d.services.UnityAdsConstants;
import i1.a0;
import i1.c0;
import i1.f0;
import i1.i0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import l1.y;
import lj.j0;
import lj.k0;
import lj.l0;
import lj.m0;
import lj.n0;
import lj.q;
import oa.e0;
import p1.v;
import q8.u;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements l1.g, UserChoiceBillingListener, AlternativeBillingOnlyReportingDetailsListener, BillingConfigResponseListener, PurchasesResponseListener, AcknowledgePurchaseResponseListener, ConsumeResponseListener, AlternativeBillingOnlyInformationDialogListener, AlternativeBillingOnlyAvailabilityListener, l1.k, SuccessContinuation, h.b, n2.d, xi.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44293b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f44292a = i10;
        this.f44293b = obj;
    }

    public d0 a(v9.e eVar) throws IOException {
        p8.b bVar = (p8.b) this.f44293b;
        URL url = (URL) eVar.f52503b;
        String strConcat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(strConcat, 4)) {
            Log.i(strConcat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f48277g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(C0375hc.f28789b);
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", B5.M);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) eVar.f52505d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    am.e eVar2 = bVar.f48271a;
                    q8.m mVar = (q8.m) eVar.f52504c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    oc.d dVar = (oc.d) eVar2.f3698b;
                    oc.e eVar3 = new oc.e(bufferedWriter, dVar.f47370a, dVar.f47371b, dVar.f47372c, dVar.f47373d);
                    eVar3.h(mVar);
                    eVar3.j();
                    eVar3.f47375b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                    }
                    no.b.l("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    no.b.l("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new d0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new d0(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            d0 d0Var = new d0(responseCode, (URL) null, u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f48889a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return d0Var;
                        } catch (Throwable th2) {
                            if (gZIPInputStream == null) {
                                throw th2;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        if (inputStream == null) {
                            throw th4;
                        }
                        try {
                            inputStream.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        gZIPOutputStream.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            } catch (Throwable th8) {
                if (outputStream == null) {
                    throw th8;
                }
                try {
                    outputStream.close();
                    throw th8;
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                    throw th8;
                }
            }
        } catch (ConnectException | UnknownHostException e10) {
            no.b.t("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new d0(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, (URL) null, 0L);
        } catch (IOException | mc.b e11) {
            no.b.t("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
            return new d0(400, (URL) null, 0L);
        }
    }

    @Override // l1.g
    public void accept(Object obj) {
        ((e0) this.f44293b).b((a) obj);
    }

    @Override // n2.d
    public long b(long j10) {
        s2 s2Var = (s2) this.f44293b;
        return y.k((j10 * ((long) s2Var.f19772e)) / 1000000, 0L, s2Var.f19777j - 1);
    }

    @Override // xi.c
    public void e(Object obj) {
        int i10 = this.f44292a;
        Object obj2 = this.f44293b;
        switch (i10) {
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                long j10 = ((rc.h) obj2).f49562b;
                if (!(obj instanceof List)) {
                    t9.e.c(new tj.a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference'.", ""));
                    Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j10);
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj3 = list.get(0);
                        kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        Object obj4 = list.get(1);
                        kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new tj.a((String) obj3, (String) obj4, (String) list.get(2)));
                        Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j10);
                    }
                }
                break;
            default:
                Object obj5 = ((tj.f) obj2).f50823b;
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance'.", "", "AndroidMessage", obj5);
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj6 = list2.get(0);
                        kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list2.get(1);
                        kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new tj.a((String) obj6, (String) obj7, (String) list2.get(2)), "AndroidMessage", obj5);
                    }
                }
                break;
        }
    }

    @Override // l1.k
    public void invoke(Object obj) {
        int i10 = this.f44292a;
        Object obj2 = this.f44293b;
        switch (i10) {
            case 12:
                ((i0) obj).c((a0) obj2);
                break;
            case 13:
                ((i0) obj).o((i1.e) obj2);
                break;
            case 14:
                ((i0) obj).e((k1.c) obj2);
                break;
            case 15:
                ((i0) obj).c(((v) obj2).f48170a.Q);
                break;
            case 16:
                ((i0) obj).f((c0) obj2);
                break;
            case 17:
            case 18:
            case 19:
            default:
                q1.i iVar = (q1.i) ((q1.b) obj);
                iVar.getClass();
                iVar.f48575w = ((c2.g) obj2).f5890a;
                break;
            case 20:
                ((q1.i) ((q1.b) obj)).f48567o = (f0) obj2;
                break;
            case 21:
                xx1 xx1Var = (xx1) obj2;
                q1.i iVar2 = (q1.i) ((q1.b) obj);
                iVar2.f48577y += xx1Var.f22029h;
                iVar2.f48578z += xx1Var.f22027f;
                break;
        }
    }

    @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
    public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
        m0.a(n0.a(billingResult), (hj.b) this.f44293b);
    }

    @Override // h.b
    public void onActivityResult(Object obj) {
        TrashConsentActivity trashConsentActivity = (TrashConsentActivity) this.f44293b;
        h.a it = (h.a) obj;
        int i10 = TrashConsentActivity.f38391e;
        kotlin.jvm.internal.n.f(it, "it");
        trashConsentActivity.F(it.f42048a == -1);
    }

    @Override // com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener
    public void onAlternativeBillingOnlyAvailabilityResponse(BillingResult billingResult) {
        m0.a(n0.a(billingResult), (hj.b) this.f44293b);
    }

    @Override // com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener
    public void onAlternativeBillingOnlyInformationDialogResponse(BillingResult billingResult) {
        m0.a(n0.a(billingResult), (hj.b) this.f44293b);
    }

    @Override // com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener
    public void onAlternativeBillingOnlyTokenResponse(BillingResult result, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        String externalTransactionToken;
        hj.b bVar = (hj.b) this.f44293b;
        kotlin.jvm.internal.n.f(result, "result");
        q qVarA = n0.a(result);
        if (alternativeBillingOnlyReportingDetails == null || (externalTransactionToken = alternativeBillingOnlyReportingDetails.getExternalTransactionToken()) == null) {
            externalTransactionToken = "";
        }
        m0.a(new lj.k(qVarA, externalTransactionToken), bVar);
    }

    @Override // com.android.billingclient.api.BillingConfigResponseListener
    public void onBillingConfigResponse(BillingResult result, BillingConfig billingConfig) {
        String countryCode;
        hj.b bVar = (hj.b) this.f44293b;
        kotlin.jvm.internal.n.f(result, "result");
        q qVarA = n0.a(result);
        if (billingConfig == null || (countryCode = billingConfig.getCountryCode()) == null) {
            countryCode = "";
        }
        m0.a(new lj.n(qVarA, countryCode), bVar);
    }

    @Override // com.android.billingclient.api.ConsumeResponseListener
    public void onConsumeResponse(BillingResult billingResult, String str) {
        m0.a(n0.a(billingResult), (hj.b) this.f44293b);
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        m0.a(new lj.d0(n0.a(billingResult), n0.b(list)), (hj.b) this.f44293b);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((qd.f) this.f44293b);
    }

    @Override // com.android.billingclient.api.UserChoiceBillingListener
    public void userSelectedAlternativeBilling(UserChoiceDetails userChoiceDetails) {
        lj.g gVar = (lj.g) this.f44293b;
        kotlin.jvm.internal.n.f(userChoiceDetails, "userChoiceDetails");
        String originalExternalTransactionId = userChoiceDetails.getOriginalExternalTransactionId();
        String externalTransactionToken = userChoiceDetails.getExternalTransactionToken();
        kotlin.jvm.internal.n.e(externalTransactionToken, "getExternalTransactionToken(...)");
        List<UserChoiceDetails.Product> products = userChoiceDetails.getProducts();
        kotlin.jvm.internal.n.e(products, "getProducts(...)");
        List<UserChoiceDetails.Product> list = products;
        ArrayList arrayList = new ArrayList(p.W(list, 10));
        for (UserChoiceDetails.Product product : list) {
            kotlin.jvm.internal.n.f(product, "product");
            String id2 = product.getId();
            kotlin.jvm.internal.n.e(id2, "getId(...)");
            String offerToken = product.getOfferToken();
            String type = product.getType();
            kotlin.jvm.internal.n.e(type, "getType(...)");
            boolean zEquals = type.equals("inapp");
            lj.y yVar = lj.y.INAPP;
            if (!zEquals && type.equals("subs")) {
                yVar = lj.y.SUBS;
            }
            arrayList.add(new k0(id2, offerToken, yVar));
        }
        j0 j0Var = new j0(originalExternalTransactionId, externalTransactionToken, arrayList);
        l0 l0Var = new l0(new bh.a(13), 0);
        gVar.getClass();
        String strN = defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling", "");
        new k5.g(gVar.f45374a, strN, (xi.l) lj.g.f45373b.getValue(), (Object) null).y(j1.f.C(j0Var), new lj.f(l0Var, strN, 2));
    }

    public /* synthetic */ j(q1.a aVar, f2.u uVar, c2.g gVar, IOException iOException, boolean z10) {
        this.f44292a = 22;
        this.f44293b = gVar;
    }

    public /* synthetic */ j(q1.a aVar, Object obj, int i10) {
        this.f44292a = i10;
        this.f44293b = obj;
    }
}
