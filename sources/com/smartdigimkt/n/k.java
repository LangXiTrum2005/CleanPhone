package com.smartdigimkt.n;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.smartdigimkt.expressad.atsignalcommon.mraid.MraidUriUtil;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class k implements d, Handler.Callback {
    protected Pattern X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    protected String f36899Y;
    protected Context e0;
    protected WindVaneWebView f0;
    protected final int Z = 1;
    protected Handler g0 = new Handler(Looper.getMainLooper(), this);

    public k(Context context) {
        this.e0 = context;
    }

    @Override // com.smartdigimkt.n.d
    public WebView a() {
        return this.f0;
    }

    @Override // com.smartdigimkt.n.d
    public b b(String str) {
        if (str == null) {
            return null;
        }
        b mraidMethodContext = MraidUriUtil.getMraidMethodContext(this.f0, str);
        if (mraidMethodContext != null) {
            mraidMethodContext.f36886a = this.f0;
            return mraidMethodContext;
        }
        Matcher matcher = this.X.matcher(str);
        if (matcher.matches()) {
            b bVar = new b();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                bVar.f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                bVar.d = matcher.group(1);
                bVar.g = matcher.group(2);
                String strGroup = matcher.group(3);
                bVar.f36889e = strGroup;
                HashMap<String, String> map = com.smartdigimkt.r4.c.f38086c;
                if (map != null && map.containsKey(strGroup)) {
                    bVar.f36889e = com.smartdigimkt.r4.c.f38086c.get(bVar.f36889e);
                }
                bVar.f36886a = this.f0;
                return bVar;
            }
        }
        return null;
    }

    @Override // com.smartdigimkt.n.d
    public boolean c(String str) {
        if (!com.smartdigimkt.v4.d.f(str)) {
            return false;
        }
        a(com.smartdigimkt.v4.d.c(str));
        d(str);
        return true;
    }

    @Override // com.smartdigimkt.n.d
    public void d(String str) {
        this.f36899Y = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        b bVar = (b) message.obj;
        if (bVar == null) {
            return false;
        }
        try {
            if (message.what == 1) {
                Object obj = bVar.f36887b;
                com.smartdigimkt.l.c.f fVar = bVar.f36888c;
                if (fVar != null && obj != null) {
                    fVar.a(obj, bVar, TextUtils.isEmpty(bVar.f) ? JsonUtils.EMPTY_JSON : bVar.f);
                }
                return true;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    @Override // com.smartdigimkt.n.d
    public void a(WindVaneWebView windVaneWebView) {
        this.f0 = windVaneWebView;
    }

    @Override // com.smartdigimkt.n.d
    public void a(String str) {
        b bVarB;
        if (TextUtils.isEmpty(str) || (bVarB = b(str)) == null) {
            return;
        }
        a(bVarB);
    }

    public void a(b bVar) {
        WindVaneWebView windVaneWebView = bVar.f36886a;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(bVar.d);
        if (jsObject == null) {
            return;
        }
        try {
            com.smartdigimkt.l.c.f fVarA = com.smartdigimkt.l.c.a(this.e0.getClassLoader(), jsObject.getClass().getName()).a(bVar.f36889e, Object.class, String.class);
            fVarA.a();
            if (jsObject instanceof j) {
                bVar.f36888c = fVarA;
                bVar.f36887b = jsObject;
                a(1, bVar);
            }
        } catch (com.smartdigimkt.l.c.b.a e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.n.d
    public String b() {
        return this.f36899Y;
    }

    public void a(int i2, b bVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i2;
        messageObtain.obj = bVar;
        this.g0.sendMessage(messageObtain);
    }

    @Override // com.smartdigimkt.n.d
    public void a(Pattern pattern) {
        this.X = pattern;
    }
}
