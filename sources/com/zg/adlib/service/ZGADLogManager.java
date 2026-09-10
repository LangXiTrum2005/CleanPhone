package com.zg.adlib.service;

import android.content.Context;
import androidx.room.d;
import androidx.room.e;
import b0.c;
import com.p004ironsource.d9;
import com.p004ironsource.m5;
import com.unity3d.services.core.fid.Constants;
import com.zg.adlib.ZGAd;
import com.zg.adlib.model.LogCustomEvent;
import com.zg.adlib.model.MLog;
import com.zg.adlib.model.MLogRequestM;
import com.zg.adlib.resource.Resource;
import com.zg.adlib.storage.AppPreferences;
import com.zg.adlib.util.TimeUtil;
import io.reactivex.schedulers.Schedulers;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ'\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\f\"\u00020\n¢\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0003X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/zg/adlib/service/ZGADLogManager;", "", "s", "Lcom/zg/adlib/service/MServiceUser;", "<init>", "(Lcom/zg/adlib/service/MServiceUser;)V", "MServiceUser", "sendCustomLog", "", d9.h.j0, "", "value", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZGADLogManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<ZGADLogManager> instance$delegate = LazyKt.a(LazyThreadSafetyMode.Z, new e(3));
    private MServiceUser MServiceUser;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/zg/adlib/service/ZGADLogManager$Companion;", "", "<init>", "()V", m5.f25675p, "Lcom/zg/adlib/service/ZGADLogManager;", Constants.GET_INSTANCE, "()Lcom/zg/adlib/service/ZGADLogManager;", "instance$delegate", "Lkotlin/Lazy;", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ZGADLogManager getInstance() {
            return (ZGADLogManager) ZGADLogManager.instance$delegate.getX();
        }

        private Companion() {
        }
    }

    public ZGADLogManager(MServiceUser s) {
        Intrinsics.f(s, "s");
        this.MServiceUser = s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZGADLogManager instance_delegate$lambda$4() {
        Context context = ZGAd.getInstance().getContext();
        Intrinsics.e(context, "getContext(...)");
        return new ZGADLogManager(new MServiceUser(context, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendCustomLog$lambda$0(Resource resource) {
        return Unit.f43263a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendCustomLog$lambda$2(Resource resource) {
        return Unit.f43263a;
    }

    public final void sendCustomLog(String eventName) {
        Intrinsics.f(eventName, "eventName");
        try {
            TimeUtil timeUtil = TimeUtil.INSTANCE;
            AppPreferences appPreferences = AppPreferences.INSTANCE;
            boolean z2 = false;
            boolean z3 = false;
            MLogRequestM mLogRequestM = new MLogRequestM(CollectionsKt.H(new MLog(CollectionsKt.i0(new LogCustomEvent(appPreferences.getDeviceId(), appPreferences.getDeviceId(), z2, z3, eventName, "", "", "", Intrinsics.a(timeUtil.formatTime(appPreferences.getFirst_install_time(), "yyyy/MM/dd"), timeUtil.formatTime(System.currentTimeMillis(), "yyyy/MM/dd")), null, null, null, null, null, null, 32256, null).generateMsgList()), (int) (System.currentTimeMillis() / ((long) 1000)))), null, null, 6, null);
            try {
                MServiceUser mServiceUser = this.MServiceUser;
                if (mServiceUser == null) {
                    Intrinsics.m("MServiceUser");
                    throw null;
                }
                mServiceUser.updateMLog(mLogRequestM).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new c(1, new d(5)));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }

    public final void sendCustomLog(String eventName, String... value) {
        Intrinsics.f(eventName, "eventName");
        Intrinsics.f(value, "value");
        try {
            TimeUtil timeUtil = TimeUtil.INSTANCE;
            AppPreferences appPreferences = AppPreferences.INSTANCE;
            boolean zA = Intrinsics.a(timeUtil.formatTime(appPreferences.getFirst_install_time(), "yyyy/MM/dd"), timeUtil.formatTime(System.currentTimeMillis(), "yyyy/MM/dd"));
            String deviceId = appPreferences.getDeviceId();
            String deviceId2 = appPreferences.getDeviceId();
            String str = !(value.length == 0) ? value[0] : "";
            String str2 = str;
            MLogRequestM mLogRequestM = new MLogRequestM(CollectionsKt.H(new MLog(CollectionsKt.i0(new LogCustomEvent(deviceId, deviceId2, false, false, eventName, str2, value.length >= 2 ? value[1] : "", value.length >= 3 ? value[2] : "", zA, null, null, null, null, null, null, 32256, null).generateMsgList()), (int) (System.currentTimeMillis() / ((long) 1000)))), null, null, 6, null);
            try {
                MServiceUser mServiceUser = this.MServiceUser;
                if (mServiceUser != null) {
                    mServiceUser.updateMLog(mLogRequestM).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new c(2, new d(6)));
                } else {
                    Intrinsics.m("MServiceUser");
                    throw null;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
