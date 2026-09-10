package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.taiyuan;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC2917g3 extends Handler {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2917g3(Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
    }

    public final void a(S2 s2) throws InterruptedException {
        C3315w3 c3315w3 = C3315w3.a;
        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
        String str = s2.b;
        b(s2);
        C3315w3.a(s2, "RETRY_EXHAUSTED");
        taiyuan.saneness(null, new C2865e3(s2, null), 1, null);
        C3315w3.f.remove(s2);
        if (C3315w3.f.isEmpty()) {
            taiyuan.saneness(null, new C2891f3(this, null), 1, null);
        }
    }

    public final void b(S2 s2) {
        int iEmpress = CollectionsKt.empress(C3315w3.f, s2);
        if (-1 != iEmpress) {
            S2 s3 = (S2) C3315w3.f.get(iEmpress == C3315w3.f.size() + (-1) ? 0 : iEmpress + 1);
            Message messageObtain = Message.obtain();
            messageObtain.what = s3.e ? 3 : 2;
            messageObtain.obj = s3;
            long pingInterval = C3315w3.c().getPingInterval() * 1000;
            if (System.currentTimeMillis() - s3.g < pingInterval) {
                sendMessageDelayed(messageObtain, pingInterval);
            } else {
                sendMessage(messageObtain);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (C3315w3.h.get()) {
            try {
                int i = msg.what;
                int i2 = 3;
                if (i == 1) {
                    if (C3315w3.e()) {
                        AdConfig.ImaiConfig imaiConfigC = C3315w3.c();
                        W2 w2 = (W2) C3315w3.b.getValue();
                        List list = (List) taiyuan.saneness(null, new Z2(w2, imaiConfigC, null), 1, null);
                        C3315w3.f = list;
                        if (list.isEmpty()) {
                            taiyuan.saneness(null, new C2762a3(w2, this, imaiConfigC, null), 1, null);
                            return;
                        }
                        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        for (S2 s2 : C3315w3.f) {
                            C3315w3 c3315w3 = C3315w3.a;
                            Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                            String str = s2.b;
                        }
                        S2 s3 = (S2) C3315w3.f.get(0);
                        Message messageObtain = Message.obtain();
                        if (!s3.e) {
                            i2 = 2;
                        }
                        messageObtain.what = i2;
                        messageObtain.obj = s3;
                        long jCurrentTimeMillis = System.currentTimeMillis() - s3.g;
                        if (jCurrentTimeMillis < imaiConfigC.getPingInterval() * 1000) {
                            sendMessageDelayed(messageObtain, ((long) (imaiConfigC.getPingInterval() * 1000)) - jCurrentTimeMillis);
                            return;
                        } else {
                            sendMessage(messageObtain);
                            return;
                        }
                    }
                    return;
                }
                if (i == 2) {
                    if (Re.a() != null) {
                        C3315w3.g.set(false);
                        C3315w3.g();
                        return;
                    }
                    Object obj = msg.obj;
                    AdConfig.ImaiConfig imaiConfigC2 = C3315w3.c();
                    if (!(obj instanceof S2)) {
                        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        return;
                    }
                    if (((S2) obj).f != 0) {
                        if (System.currentTimeMillis() - ((S2) obj).h <= imaiConfigC2.getPingCacheExpiry() * ((long) 1000)) {
                            if ((imaiConfigC2.getMaxRetries() - ((S2) obj).f) + 1 == 0) {
                                Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                            } else {
                                Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                            }
                            taiyuan.saneness(null, new C2788b3((S2) obj, this, null), 1, null);
                            return;
                        }
                    }
                    a((S2) obj);
                    return;
                }
                if (i != 3) {
                    if (i != 4) {
                        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        Unit unit = Unit.f29295attabal;
                        return;
                    }
                    Object obj2 = msg.obj;
                    Intrinsics.competently(obj2, "null cannot be cast to non-null type com.inmobi.ads.core.Click");
                    S2 click = (S2) obj2;
                    Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                    String str2 = click.b;
                    LinkedHashMap linkedHashMap = C3315w3.j;
                    C2759a0 c2759a0 = (C2759a0) linkedHashMap.get(Integer.valueOf(click.a));
                    if (c2759a0 != null) {
                        Intrinsics.checkNotNullParameter(click, "click");
                        c2759a0.a.a(c2759a0.b);
                    }
                    linkedHashMap.remove(Integer.valueOf(click.a));
                    taiyuan.saneness(null, new C2840d3(click, this, null), 1, null);
                    return;
                }
                if (Re.a() != null) {
                    C3315w3.g.set(false);
                    C3315w3.g();
                    return;
                }
                Object obj3 = msg.obj;
                AdConfig.ImaiConfig imaiConfigC3 = C3315w3.c();
                if (!(obj3 instanceof S2)) {
                    Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                    return;
                }
                if (((S2) obj3).f != 0) {
                    if (System.currentTimeMillis() - ((S2) obj3).h <= imaiConfigC3.getPingCacheExpiry() * ((long) 1000)) {
                        if ((imaiConfigC3.getMaxRetries() - ((S2) obj3).f) + 1 == 0) {
                            Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        } else {
                            Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        }
                        new C2967i3(new C2814c3(this)).a((S2) obj3);
                        Unit unit2 = Unit.f29295attabal;
                        return;
                    }
                }
                a((S2) obj3);
            } catch (Exception e) {
                C3315w3 c3315w4 = C3315w3.a;
                Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                e.getMessage();
            }
        }
    }
}
