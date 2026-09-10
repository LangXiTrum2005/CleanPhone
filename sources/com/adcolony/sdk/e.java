package com.adcolony.sdk;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import kotlin.io.CloseableKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class e extends j {
    private String G;
    private String H;

    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e.super.c();
        }
    }

    public e(Context context, int i2, h0 h0Var) {
        super(context, i2, h0Var);
        this.G = "";
        this.H = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.adcolony.sdk.c1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(Exception exc) {
        new e0.a().a(exc.getClass().toString()).a(" during metadata injection w/ metadata = ").a(c0.h(getInfo(), TtmlNode.TAG_METADATA)).a(e0.f9132i);
        AdColonyInterstitial adColonyInterstitialRemove = com.adcolony.sdk.a.b().c().f().remove(c0.h(getInfo(), "ad_session_id"));
        if (adColonyInterstitialRemove == null) {
            return;
        }
        adColonyInterstitialRemove.p();
    }

    private final String p() throws IOException {
        String string;
        if (this.H.length() > 0) {
            return new Regex("script\\s*src\\s*=\\s*\"mraid.js\"").e("script src=\"file://" + getMraidFilepath() + AbstractJsonLexerKt.STRING, this.H);
        }
        FileInputStream fileInputStream = new FileInputStream(this.G);
        try {
            StringBuilder sb = new StringBuilder(fileInputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = fileInputStream.read(bArr, 0, 1024);
                if (i2 < 0) {
                    break;
                }
                sb.append(new String(bArr, 0, i2, Charsets.f44691a));
            }
            if (StringsKt.l(this.G, ".html", false)) {
                string = sb.toString();
            } else {
                string = "<html><script>" + ((Object) sb) + "</script></html>";
            }
            fileInputStream.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    @Override // com.adcolony.sdk.c1
    public /* synthetic */ String d(f1 f1Var) {
        return this.H.length() > 0 ? "" : super.d(f1Var);
    }

    @Override // com.adcolony.sdk.j, com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ void i() {
        h0 message = getMessage();
        f1 f1VarA = message == null ? null : message.a();
        if (f1VarA == null) {
            f1VarA = c0.b();
        }
        this.G = c(f1VarA);
        this.H = c0.h(f1VarA, "interstitial_html");
        super.i();
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void j() {
        try {
            h0 message = getMessage();
            f1 f1VarA = message == null ? null : message.a();
            if (f1VarA == null) {
                f1VarA = c0.b();
            }
            String strH = c0.h(c0.f(f1VarA, "info"), TtmlNode.TAG_METADATA);
            String strA = a(p(), c0.h(c0.b(strH), "iab_filepath"));
            String strE = new Regex("var\\s*ADC_DEVICE_INFO\\s*=\\s*null\\s*;").e(Matcher.quoteReplacement("var ADC_DEVICE_INFO = " + ((Object) strH) + ';'), strA);
            String mUrl = getMUrl();
            if (mUrl.length() == 0) {
                mUrl = getBaseUrl();
            }
            try {
                loadDataWithBaseURL(mUrl, strE, "text/html", null, null);
            } catch (IOException e2) {
                e = e2;
                b(e);
            } catch (IllegalArgumentException e3) {
                e = e3;
                b(e);
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
                b(e);
            }
        } catch (IOException e5) {
            e = e5;
        } catch (IllegalArgumentException e6) {
            e = e6;
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
        }
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void k() {
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.k0
    public void c() {
        if (getDestroyed()) {
            return;
        }
        z0.a(new a(), n() ? 1000L : 0L);
    }
}
