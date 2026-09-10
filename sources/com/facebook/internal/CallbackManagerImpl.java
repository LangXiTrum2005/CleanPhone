package com.facebook.internal;

import android.content.Intent;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl;", "Lcom/facebook/CallbackManager;", "Callback", "Companion", "RequestCodeOffset", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class CallbackManagerImpl implements CallbackManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16265a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f16264c = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f16263b = new HashMap();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl$Callback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {
        boolean a(int i2, Intent intent);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl$Companion;", "", "", "", "Lcom/facebook/internal/CallbackManagerImpl$Callback;", "staticCallbacks", "Ljava/util/Map;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        /* JADX INFO: Fake field, exist only in values array */
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15);

        public final int X;

        RequestCodeOffset(int i2) {
            this.X = i2;
        }

        public final int d() {
            HashSet hashSet = FacebookSdk.f15915a;
            Validate.h();
            return FacebookSdk.j + this.X;
        }
    }

    public static final synchronized void a(int i2, Callback callback) {
        synchronized (f16264c) {
            HashMap map = f16263b;
            if (!map.containsKey(Integer.valueOf(i2))) {
                map.put(Integer.valueOf(i2), callback);
            }
        }
    }

    @Override // com.facebook.CallbackManager
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        Callback callback;
        Callback callback2 = (Callback) this.f16265a.get(Integer.valueOf(i2));
        if (callback2 != null) {
            return callback2.a(i3, intent);
        }
        synchronized (f16264c) {
            callback = (Callback) f16263b.get(Integer.valueOf(i2));
        }
        if (callback != null) {
            return callback.a(i3, intent);
        }
        return false;
    }
}
