package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class h implements b, Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Pattern f34937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f34938b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f34940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f34941e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f34939c = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Handler f34942f = new Handler(Looper.getMainLooper(), this);

    public h(Context context) {
        this.f34940d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.f34941e = windVaneWebView;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (!i.f(str)) {
            return false;
        }
        a(i.c(str));
        d(str);
        return true;
    }

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f34941e, str);
        if (aVarA != null) {
            aVarA.f34912b = this.f34941e;
            return aVarA;
        }
        Matcher matcher = this.f34937a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                aVar.f34916f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                aVar.f34914d = matcher.group(1);
                aVar.f34917g = matcher.group(2);
                String strGroup = matcher.group(3);
                aVar.f34915e = strGroup;
                HashMap<String, String> map = com.mbridge.msdk.mbsignalcommon.base.e.f34815k;
                if (map != null && map.containsKey(strGroup)) {
                    aVar.f34915e = com.mbridge.msdk.mbsignalcommon.base.e.f34815k.get(aVar.f34915e);
                }
                aVar.f34912b = this.f34941e;
                return aVar;
            }
        }
        return null;
    }

    public void d(String str) {
        this.f34938b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
            if (message.what == 1) {
                Object obj = aVar.f34913c;
                com.mbridge.msdk.mbsignalcommon.mapping.b.C0151b c0151b = aVar.f34911a;
                if (c0151b != null && obj != null) {
                    c0151b.a(obj, aVar, TextUtils.isEmpty(aVar.f34916f) ? JsonUtils.EMPTY_JSON : aVar.f34916f);
                }
                return true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a aVarC;
        if (TextUtils.isEmpty(str) || (aVarC = c(str)) == null) {
            return;
        }
        a(aVarC);
    }

    public void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.f34912b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.f34914d);
        if (jsObject == null) {
            return;
        }
        try {
            com.mbridge.msdk.mbsignalcommon.mapping.b.C0151b c0151bA = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.f34940d.getClassLoader(), jsObject.getClass().getName()).a(aVar.f34915e, Object.class, String.class);
            c0151bA.a();
            if (jsObject instanceof g) {
                aVar.f34911a = c0151bA;
                aVar.f34913c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void a(int i10, a aVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.obj = aVar;
        this.f34942f.sendMessage(messageObtain);
    }

    public void a(Pattern pattern) {
        this.f34937a = pattern;
    }
}
