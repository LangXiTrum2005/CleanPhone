package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC3171p2 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC3333z5 f23880a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3171p2(Looper looper) {
        super(looper);
        Intrinsics.f(looper, "looper");
    }

    public final void a(C3107l2 click) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23880a;
        if (interfaceC3333z5 != null) {
            String strF = C3298x2.f();
            ((A5) interfaceC3333z5).a(strF, androidx.media3.extractor.text.ttml.a.p(H6.a(strF, "access$getTAG$p(...)", "Retry attemps exhausted for click ("), click.f23759b, ')'));
        }
        b(click);
        C3298x2.f24089a.a(click, "RETRY_EXHAUSTED");
        C3123m2 c3123m2B = Nc.b();
        c3123m2B.getClass();
        Intrinsics.f(click, "click");
        c3123m2B.a("id = ?", new String[]{String.valueOf(click.f23758a)});
        C3298x2.f24092e.remove(click);
    }

    public final void b(C3107l2 c3107l2) {
        List list = C3298x2.f24092e;
        Intrinsics.f(list, "<this>");
        int iIndexOf = list.indexOf(c3107l2);
        if (-1 != iIndexOf) {
            C3107l2 c3107l3 = (C3107l2) C3298x2.f24092e.get(iIndexOf == C3298x2.f24092e.size() + (-1) ? 0 : iIndexOf + 1);
            Message messageObtain = Message.obtain();
            messageObtain.what = c3107l3.f23761e ? 3 : 2;
            messageObtain.obj = c3107l3;
            AdConfig.ImaiConfig imaiConfig = C3298x2.g;
            long pingInterval = (imaiConfig != null ? imaiConfig.getPingInterval() : 0) * 1000;
            if (System.currentTimeMillis() - c3107l3.g < pingInterval) {
                sendMessageDelayed(messageObtain, pingInterval);
            } else {
                sendMessage(messageObtain);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.f(msg, "msg");
        if (C3298x2.f24093h.get()) {
            try {
                int i2 = msg.what;
                int i3 = 3;
                if (i2 == 1) {
                    if (C3298x2.f24089a.g()) {
                        AdConfig.ImaiConfig imaiConfig = C3298x2.g;
                        C3123m2 c3123m2B = Nc.b();
                        if (imaiConfig == null) {
                            InterfaceC3333z5 interfaceC3333z5 = this.f23880a;
                            if (interfaceC3333z5 != null) {
                                String strF = C3298x2.f();
                                Intrinsics.e(strF, "access$getTAG$p(...)");
                                ((A5) interfaceC3333z5).b(strF, "Unhandled message due to ImaiConfig Null");
                                return;
                            }
                            return;
                        }
                        C3298x2.f24092e = c3123m2B.a(imaiConfig.getMaxEventBatch(), imaiConfig.getPingInterval());
                        if (C3298x2.f24092e.isEmpty()) {
                            if (T1.a(c3123m2B, null, null, 63) == 0) {
                                C3298x2.f.set(false);
                                return;
                            }
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1;
                            sendMessageDelayed(messageObtain, imaiConfig.getPingInterval() * 1000);
                            return;
                        }
                        InterfaceC3333z5 interfaceC3333z6 = this.f23880a;
                        if (interfaceC3333z6 != null) {
                            String strF2 = C3298x2.f();
                            Intrinsics.e(strF2, "access$getTAG$p(...)");
                            ((A5) interfaceC3333z6).a(strF2, "Processing following click batch");
                        }
                        for (C3107l2 c3107l2 : C3298x2.f24092e) {
                            Intrinsics.e(C3298x2.f(), "access$getTAG$p(...)");
                            String str = c3107l2.f23759b;
                        }
                        C3107l2 c3107l3 = (C3107l2) C3298x2.f24092e.get(0);
                        Message messageObtain2 = Message.obtain();
                        if (!c3107l3.f23761e) {
                            i3 = 2;
                        }
                        messageObtain2.what = i3;
                        messageObtain2.obj = c3107l3;
                        long jCurrentTimeMillis = System.currentTimeMillis() - c3107l3.g;
                        if (jCurrentTimeMillis < imaiConfig.getPingInterval() * 1000) {
                            sendMessageDelayed(messageObtain2, ((long) (imaiConfig.getPingInterval() * 1000)) - jCurrentTimeMillis);
                            return;
                        } else {
                            sendMessage(messageObtain2);
                            return;
                        }
                    }
                    return;
                }
                if (i2 == 2) {
                    if (T9.a(false) != null) {
                        C3298x2.f.set(false);
                        C3298x2.a(C3298x2.f24089a);
                        return;
                    }
                    Object obj = msg.obj;
                    AdConfig.ImaiConfig imaiConfig2 = C3298x2.g;
                    if ((obj instanceof C3107l2) && imaiConfig2 != null) {
                        if (((C3107l2) obj).f != 0) {
                            C3107l2 c3107l4 = (C3107l2) obj;
                            long pingCacheExpiry = imaiConfig2.getPingCacheExpiry();
                            c3107l4.getClass();
                            if (System.currentTimeMillis() - c3107l4.f23762h <= pingCacheExpiry * ((long) 1000)) {
                                int maxRetries = (imaiConfig2.getMaxRetries() - ((C3107l2) obj).f) + 1;
                                if (maxRetries == 0) {
                                    InterfaceC3333z5 interfaceC3333z7 = this.f23880a;
                                    if (interfaceC3333z7 != null) {
                                        String strF3 = C3298x2.f();
                                        Intrinsics.e(strF3, "access$getTAG$p(...)");
                                        ((A5) interfaceC3333z7).a(strF3, "Pinging click (" + ((C3107l2) obj).f23759b + ") over HTTP");
                                    }
                                } else {
                                    InterfaceC3333z5 interfaceC3333z8 = this.f23880a;
                                    if (interfaceC3333z8 != null) {
                                        String strF4 = C3298x2.f();
                                        Intrinsics.e(strF4, "access$getTAG$p(...)");
                                        ((A5) interfaceC3333z8).a(strF4, "Retry attempt #" + maxRetries + " for click (" + ((C3107l2) obj).f23759b + ") over HTTP");
                                    }
                                }
                                new C3218s2(new C3139n2(this), this.f23880a).a((C3107l2) obj);
                                return;
                            }
                        }
                        a((C3107l2) obj);
                        return;
                    }
                    InterfaceC3333z5 interfaceC3333z9 = this.f23880a;
                    if (interfaceC3333z9 != null) {
                        String strF5 = C3298x2.f();
                        Intrinsics.e(strF5, "access$getTAG$p(...)");
                        ((A5) interfaceC3333z9).b(strF5, "Unhandled message due to ImaiConfig Null");
                        return;
                    }
                    return;
                }
                if (i2 == 3) {
                    if (T9.a(false) != null) {
                        C3298x2.f.set(false);
                        C3298x2.a(C3298x2.f24089a);
                        return;
                    }
                    Object obj2 = msg.obj;
                    AdConfig.ImaiConfig imaiConfig3 = C3298x2.g;
                    if ((obj2 instanceof C3107l2) && imaiConfig3 != null) {
                        if (((C3107l2) obj2).f != 0) {
                            C3107l2 c3107l5 = (C3107l2) obj2;
                            long pingCacheExpiry2 = imaiConfig3.getPingCacheExpiry();
                            c3107l5.getClass();
                            if (System.currentTimeMillis() - c3107l5.f23762h <= pingCacheExpiry2 * ((long) 1000)) {
                                int maxRetries2 = (imaiConfig3.getMaxRetries() - ((C3107l2) obj2).f) + 1;
                                if (maxRetries2 == 0) {
                                    InterfaceC3333z5 interfaceC3333z10 = this.f23880a;
                                    if (interfaceC3333z10 != null) {
                                        String strF6 = C3298x2.f();
                                        Intrinsics.e(strF6, "access$getTAG$p(...)");
                                        ((A5) interfaceC3333z10).a(strF6, "Pinging click (" + ((C3107l2) obj2).f23759b + ") in WebView");
                                    }
                                } else {
                                    InterfaceC3333z5 interfaceC3333z11 = this.f23880a;
                                    if (interfaceC3333z11 != null) {
                                        String strF7 = C3298x2.f();
                                        Intrinsics.e(strF7, "access$getTAG$p(...)");
                                        ((A5) interfaceC3333z11).b(strF7, "Retry attempt #" + maxRetries2 + " for click (" + ((C3107l2) obj2).f23759b + ") using WebView");
                                    }
                                }
                                new C3202r2(new C3155o2(this), this.f23880a).a((C3107l2) obj2);
                                return;
                            }
                        }
                        a((C3107l2) obj2);
                        return;
                    }
                    InterfaceC3333z5 interfaceC3333z12 = this.f23880a;
                    if (interfaceC3333z12 != null) {
                        String strF8 = C3298x2.f();
                        Intrinsics.e(strF8, "access$getTAG$p(...)");
                        ((A5) interfaceC3333z12).b(strF8, "Unhandled message due to ImaiConfig Null");
                        return;
                    }
                    return;
                }
                if (i2 != 4) {
                    InterfaceC3333z5 interfaceC3333z13 = this.f23880a;
                    if (interfaceC3333z13 != null) {
                        String strF9 = C3298x2.f();
                        Intrinsics.e(strF9, "access$getTAG$p(...)");
                        ((A5) interfaceC3333z13).b(strF9, "Unhandled message ( " + msg.what + " ) in pingHandler");
                        return;
                    }
                    return;
                }
                Object obj3 = msg.obj;
                Intrinsics.d(obj3, "null cannot be cast to non-null type com.inmobi.ads.core.Click");
                C3107l2 c3107l6 = (C3107l2) obj3;
                InterfaceC3333z5 interfaceC3333z14 = this.f23880a;
                if (interfaceC3333z14 != null) {
                    String strF10 = C3298x2.f();
                    Intrinsics.e(strF10, "access$getTAG$p(...)");
                    ((A5) interfaceC3333z14).a(strF10, "Processing click (" + c3107l6.f23759b + ") completed");
                }
                C3298x2.b(C3298x2.f24089a, c3107l6);
                C3123m2 c3123m2B2 = Nc.b();
                c3123m2B2.getClass();
                c3123m2B2.a("id = ?", new String[]{String.valueOf(c3107l6.f23758a)});
                C3298x2.f24092e.remove(c3107l6);
                if (!C3298x2.f24092e.isEmpty()) {
                    C3107l2 c3107l7 = (C3107l2) C3298x2.f24092e.get(0);
                    Message messageObtain3 = Message.obtain();
                    if (c3107l7 == null || !c3107l7.f23761e) {
                        i3 = 2;
                    }
                    messageObtain3.what = i3;
                    messageObtain3.obj = c3107l7;
                    sendMessage(messageObtain3);
                    return;
                }
                C3123m2 c3123m2B3 = Nc.b();
                c3123m2B3.getClass();
                if (T1.a(c3123m2B3, null, null, 63) != 0) {
                    Message messageObtain4 = Message.obtain();
                    messageObtain4.what = 1;
                    sendMessage(messageObtain4);
                } else {
                    InterfaceC3333z5 interfaceC3333z15 = this.f23880a;
                    if (interfaceC3333z15 != null) {
                        String strF11 = C3298x2.f();
                        Intrinsics.e(strF11, "access$getTAG$p(...)");
                        ((A5) interfaceC3333z15).a(strF11, "Done processing all clicks!");
                    }
                    C3298x2.f.set(false);
                }
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z16 = this.f23880a;
                if (interfaceC3333z16 != null) {
                    String strF12 = C3298x2.f();
                    ((A5) interfaceC3333z16).b(strF12, rf.a(e2, H6.a(strF12, "access$getTAG$p(...)", "SDK encountered unexpected error in processing ping; ")));
                }
            }
        }
    }
}
