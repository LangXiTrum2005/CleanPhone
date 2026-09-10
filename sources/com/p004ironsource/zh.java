package com.p004ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0003\u0004BK\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b)\u0010*J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J[\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/ironsource/zh;", "", "", "a", "b", "c", "d", "Landroid/graphics/drawable/Drawable;", "e", "Landroid/webkit/WebView;", f.j, "Landroid/view/View;", g.f40227p, "title", d9.h.F0, "body", "cta", "icon", "mediaView", d9.h.J0, "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", dc.q, "()Ljava/lang/String;", h.f36614b, i.f37957c, "j", "Landroid/graphics/drawable/Drawable;", "k", "()Landroid/graphics/drawable/Drawable;", "Landroid/webkit/WebView;", "l", "()Landroid/webkit/WebView;", "Landroid/view/View;", "m", "()Landroid/view/View;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/webkit/WebView;Landroid/view/View;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String advertiser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String body;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String cta;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Drawable icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final WebView mediaView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final View privacyIcon;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0007J\u0016\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ironsource/zh$a;", "", "", "adViewId", "Lkotlin/Result;", "Landroid/webkit/WebView;", "a", "(Ljava/lang/String;)Lkotlin/Result;", "iconUrl", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/content/Context;", "activityContext", "Lorg/json/JSONObject;", "json", "Lcom/ironsource/zh$b;", "Lcom/ironsource/qi;", "Lcom/ironsource/qi;", "imageLoader", "Lcom/ironsource/z2;", "Lcom/ironsource/z2;", "adViewManagement", "<init>", "(Lcom/ironsource/qi;Lcom/ironsource/z2;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final qi imageLoader;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final z2 adViewManagement;

        public a(qi imageLoader, z2 adViewManagement) {
            Intrinsics.f(imageLoader, "imageLoader");
            Intrinsics.f(adViewManagement, "adViewManagement");
            this.imageLoader = imageLoader;
            this.adViewManagement = adViewManagement;
        }

        private final Result<Drawable> b(String iconUrl) {
            if (iconUrl == null) {
                return null;
            }
            return new Result<>(this.imageLoader.a(iconUrl));
        }

        public final b a(Context activityContext, JSONObject json) {
            Intrinsics.f(activityContext, "activityContext");
            Intrinsics.f(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("title");
            String strB = jSONObjectOptJSONObject != null ? JSONObject.b(jSONObjectOptJSONObject, "text") : null;
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(d9.h.F0);
            String strB2 = jSONObjectOptJSONObject2 != null ? JSONObject.b(jSONObjectOptJSONObject2, "text") : null;
            JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("body");
            String strB3 = jSONObjectOptJSONObject3 != null ? JSONObject.b(jSONObjectOptJSONObject3, "text") : null;
            JSONObject jSONObjectOptJSONObject4 = json.optJSONObject("cta");
            String strB4 = jSONObjectOptJSONObject4 != null ? JSONObject.b(jSONObjectOptJSONObject4, "text") : null;
            JSONObject jSONObjectOptJSONObject5 = json.optJSONObject("icon");
            String strB5 = jSONObjectOptJSONObject5 != null ? JSONObject.b(jSONObjectOptJSONObject5, "url") : null;
            JSONObject jSONObjectOptJSONObject6 = json.optJSONObject(d9.h.I0);
            String strB6 = jSONObjectOptJSONObject6 != null ? JSONObject.b(jSONObjectOptJSONObject6, "adViewId") : null;
            JSONObject jSONObjectOptJSONObject7 = json.optJSONObject(d9.h.J0);
            return new b(new b.a(strB, strB2, strB3, strB4, b(strB5), a(strB6), wq.INSTANCE.a(activityContext, jSONObjectOptJSONObject7 != null ? JSONObject.b(jSONObjectOptJSONObject7, "url") : null, this.imageLoader)));
        }

        private final Result<WebView> a(String adViewId) {
            if (adViewId == null) {
                return null;
            }
            di diVarA = this.adViewManagement.a(adViewId);
            WebView presentingView = diVarA != null ? diVarA.getPresentingView() : null;
            return presentingView == null ? new Result<>(ResultKt.a(new Exception(androidx.media3.extractor.text.ttml.a.i('\'', "missing adview for id: '", adViewId)))) : new Result<>(presentingView);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/zh$b;", "", "Lorg/json/JSONObject;", "b", "Lcom/ironsource/zh$b$a;", "a", "Lcom/ironsource/zh$b$a;", "()Lcom/ironsource/zh$b$a;", "data", "<init>", "(Lcom/ironsource/zh$b$a;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a data;

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BZ\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\u0006\u0010\u0017\u001a\u00020\u000fø\u0001\u0002¢\u0006\u0004\b*\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\fJ\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003Jj\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\b\b\u0002\u0010\u0017\u001a\u00020\u000fHÆ\u0001ø\u0001\u0002J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b#\u0010 R(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\fR(\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b&\u0010\fR\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/ironsource/zh$b$a;", "", "Lcom/ironsource/zh;", h.f36614b, "", "a", "b", "c", "d", "Lkotlin/Result;", "Landroid/graphics/drawable/Drawable;", "e", "()Lkotlin/Result;", "Landroid/webkit/WebView;", f.j, "Landroid/view/View;", g.f40227p, "title", d9.h.F0, "body", "cta", "icon", d9.h.I0, d9.h.J0, "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "o", "()Ljava/lang/String;", i.f37957c, "j", "k", "Lkotlin/Result;", "l", "m", "Landroid/view/View;", dc.q, "()Landroid/view/View;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Result;Lkotlin/Result;Landroid/view/View;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String advertiser;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String body;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String cta;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final Result<Drawable> icon;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final Result<WebView> media;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final View privacyIcon;

            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, String str2, String str3, String str4, Result<? extends Drawable> result, Result<? extends WebView> result2, View privacyIcon) {
                Intrinsics.f(privacyIcon, "privacyIcon");
                this.title = str;
                this.advertiser = str2;
                this.body = str3;
                this.cta = str4;
                this.icon = result;
                this.media = result2;
                this.privacyIcon = privacyIcon;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, Result result, Result result2, View view, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = aVar.title;
                }
                if ((i2 & 2) != 0) {
                    str2 = aVar.advertiser;
                }
                if ((i2 & 4) != 0) {
                    str3 = aVar.body;
                }
                if ((i2 & 8) != 0) {
                    str4 = aVar.cta;
                }
                if ((i2 & 16) != 0) {
                    result = aVar.icon;
                }
                if ((i2 & 32) != 0) {
                    result2 = aVar.media;
                }
                if ((i2 & 64) != 0) {
                    view = aVar.privacyIcon;
                }
                Result result3 = result2;
                View view2 = view;
                Result result4 = result;
                String str5 = str3;
                return aVar.a(str, str2, str5, str4, result4, result3, view2);
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getAdvertiser() {
                return this.advertiser;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getBody() {
                return this.body;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getCta() {
                return this.cta;
            }

            public final Result<Drawable> e() {
                return this.icon;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return Intrinsics.a(this.title, aVar.title) && Intrinsics.a(this.advertiser, aVar.advertiser) && Intrinsics.a(this.body, aVar.body) && Intrinsics.a(this.cta, aVar.cta) && Intrinsics.a(this.icon, aVar.icon) && Intrinsics.a(this.media, aVar.media) && Intrinsics.a(this.privacyIcon, aVar.privacyIcon);
            }

            public final Result<WebView> f() {
                return this.media;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final View getPrivacyIcon() {
                return this.privacyIcon;
            }

            public final zh h() {
                Drawable drawable;
                String str = this.title;
                String str2 = this.advertiser;
                String str3 = this.body;
                String str4 = this.cta;
                Result<Drawable> result = this.icon;
                WebView webView = null;
                if (result != null) {
                    Object obj = result.X;
                    if (obj instanceof Result.Failure) {
                        obj = null;
                    }
                    drawable = (Drawable) obj;
                } else {
                    drawable = null;
                }
                Result<WebView> result2 = this.media;
                if (result2 != null) {
                    Object obj2 = result2.X;
                    webView = (WebView) (obj2 instanceof Result.Failure ? null : obj2);
                }
                return new zh(str, str2, str3, str4, drawable, webView, this.privacyIcon);
            }

            public int hashCode() {
                Object obj;
                Object obj2;
                String str = this.title;
                int iHashCode = 0;
                int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.advertiser;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.body;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.cta;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Result<Drawable> result = this.icon;
                int iHashCode6 = (iHashCode5 + ((result == null || (obj = result.X) == null) ? 0 : obj.hashCode())) * 31;
                Result<WebView> result2 = this.media;
                if (result2 != null && (obj2 = result2.X) != null) {
                    iHashCode = obj2.hashCode();
                }
                return this.privacyIcon.hashCode() + ((iHashCode6 + iHashCode) * 31);
            }

            public final String i() {
                return this.advertiser;
            }

            public final String j() {
                return this.body;
            }

            public final String k() {
                return this.cta;
            }

            public final Result<Drawable> l() {
                return this.icon;
            }

            public final Result<WebView> m() {
                return this.media;
            }

            public final View n() {
                return this.privacyIcon;
            }

            public final String o() {
                return this.title;
            }

            public String toString() {
                return "Data(title=" + this.title + ", advertiser=" + this.advertiser + ", body=" + this.body + ", cta=" + this.cta + ", icon=" + this.icon + ", media=" + this.media + ", privacyIcon=" + this.privacyIcon + ')';
            }

            public final a a(String title, String advertiser, String body, String cta, Result<? extends Drawable> icon, Result<? extends WebView> media, View privacyIcon) {
                Intrinsics.f(privacyIcon, "privacyIcon");
                return new a(title, advertiser, body, cta, icon, media, privacyIcon);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getTitle() {
                return this.title;
            }
        }

        public b(a data) {
            Intrinsics.f(data, "data");
            this.data = data;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getData() {
            return this.data;
        }

        public final JSONObject b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (this.data.o() != null) {
                a(jSONObject, "title");
            }
            if (this.data.i() != null) {
                a(jSONObject, d9.h.F0);
            }
            if (this.data.j() != null) {
                a(jSONObject, "body");
            }
            if (this.data.k() != null) {
                a(jSONObject, "cta");
            }
            Result<Drawable> resultL = this.data.l();
            if (resultL != null) {
                a(jSONObject, "icon", resultL.X);
            }
            Result<WebView> resultM = this.data.m();
            if (resultM != null) {
                a(jSONObject, d9.h.I0, resultM.X);
            }
            return jSONObject;
        }

        private static final void a(JSONObject jSONObject, String str) throws JSONException {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", !(obj instanceof Result.Failure));
            Throwable thA = Result.a(obj);
            if (thA != null) {
                String message = thA.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            jSONObject.put(str, jSONObject2);
        }
    }

    public zh(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        Intrinsics.f(privacyIcon, "privacyIcon");
        this.title = str;
        this.advertiser = str2;
        this.body = str3;
        this.cta = str4;
        this.icon = drawable;
        this.mediaView = webView;
        this.privacyIcon = privacyIcon;
    }

    public static /* synthetic */ zh a(zh zhVar, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = zhVar.title;
        }
        if ((i2 & 2) != 0) {
            str2 = zhVar.advertiser;
        }
        if ((i2 & 4) != 0) {
            str3 = zhVar.body;
        }
        if ((i2 & 8) != 0) {
            str4 = zhVar.cta;
        }
        if ((i2 & 16) != 0) {
            drawable = zhVar.icon;
        }
        if ((i2 & 32) != 0) {
            webView = zhVar.mediaView;
        }
        if ((i2 & 64) != 0) {
            view = zhVar.privacyIcon;
        }
        WebView webView2 = webView;
        View view2 = view;
        Drawable drawable2 = drawable;
        String str5 = str3;
        return zhVar.a(str, str2, str5, str4, drawable2, webView2, view2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAdvertiser() {
        return this.advertiser;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Drawable getIcon() {
        return this.icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zh)) {
            return false;
        }
        zh zhVar = (zh) other;
        return Intrinsics.a(this.title, zhVar.title) && Intrinsics.a(this.advertiser, zhVar.advertiser) && Intrinsics.a(this.body, zhVar.body) && Intrinsics.a(this.cta, zhVar.cta) && Intrinsics.a(this.icon, zhVar.icon) && Intrinsics.a(this.mediaView, zhVar.mediaView) && Intrinsics.a(this.privacyIcon, zhVar.privacyIcon);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final WebView getMediaView() {
        return this.mediaView;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final View getPrivacyIcon() {
        return this.privacyIcon;
    }

    public final String h() {
        return this.advertiser;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.advertiser;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.body;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cta;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.icon;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.mediaView;
        return this.privacyIcon.hashCode() + ((iHashCode5 + (webView != null ? webView.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.body;
    }

    public final String j() {
        return this.cta;
    }

    public final Drawable k() {
        return this.icon;
    }

    public final WebView l() {
        return this.mediaView;
    }

    public final View m() {
        return this.privacyIcon;
    }

    public final String n() {
        return this.title;
    }

    public String toString() {
        return "ISNNativeAdData(title=" + this.title + ", advertiser=" + this.advertiser + ", body=" + this.body + ", cta=" + this.cta + ", icon=" + this.icon + ", mediaView=" + this.mediaView + ", privacyIcon=" + this.privacyIcon + ')';
    }

    public final zh a(String title, String advertiser, String body, String cta, Drawable icon, WebView mediaView, View privacyIcon) {
        Intrinsics.f(privacyIcon, "privacyIcon");
        return new zh(title, advertiser, body, cta, icon, mediaView, privacyIcon);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
