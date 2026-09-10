package com.unity3d.scar.adapter.common.signals;

import android.content.Context;
import com.unity3d.scar.adapter.common.DispatchGroup;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class SignalsCollectorBase implements ISignalsCollector {

    /* JADX INFO: renamed from: com.unity3d.scar.adapter.common.signals.SignalsCollectorBase$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42797a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f42797a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42797a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42797a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class GMAScarDispatchCompleted implements Runnable {
        public final ISignalCollectionListener X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final SignalsResult f42798Y;

        public GMAScarDispatchCompleted(ISignalCollectionListener iSignalCollectionListener, SignalsResult signalsResult) {
            this.X = iSignalCollectionListener;
            this.f42798Y = signalsResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SignalsResult signalsResult = this.f42798Y;
            HashMap map = signalsResult.f42799a;
            int size = map.size();
            ISignalCollectionListener iSignalCollectionListener = this.X;
            if (size > 0) {
                iSignalCollectionListener.onSignalsCollected(new JSONObject(map).toString());
                return;
            }
            String str = signalsResult.f42800b;
            if (str == null) {
                iSignalCollectionListener.onSignalsCollected("");
            } else {
                iSignalCollectionListener.onSignalsCollectionFailed(str);
            }
        }
    }

    public final void c(Context context, List list, BiddingSignalsHandler biddingSignalsHandler) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        SignalsResult signalsResult = new SignalsResult();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UnityAdFormat unityAdFormat = (UnityAdFormat) it.next();
            dispatchGroup.a();
            a(context, unityAdFormat, dispatchGroup, signalsResult);
        }
        GMAScarDispatchCompleted gMAScarDispatchCompleted = new GMAScarDispatchCompleted(biddingSignalsHandler, signalsResult);
        dispatchGroup.f42783b = gMAScarDispatchCompleted;
        if (dispatchGroup.f42782a <= 0) {
            gMAScarDispatchCompleted.run();
        }
    }

    public final void d(Context context, boolean z2, BiddingSignalsHandler biddingSignalsHandler) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        SignalsResult signalsResult = new SignalsResult();
        dispatchGroup.a();
        a(context, UnityAdFormat.f42794Y, dispatchGroup, signalsResult);
        dispatchGroup.a();
        a(context, UnityAdFormat.Z, dispatchGroup, signalsResult);
        if (z2) {
            dispatchGroup.a();
            a(context, UnityAdFormat.e0, dispatchGroup, signalsResult);
        }
        GMAScarDispatchCompleted gMAScarDispatchCompleted = new GMAScarDispatchCompleted(biddingSignalsHandler, signalsResult);
        dispatchGroup.f42783b = gMAScarDispatchCompleted;
        if (dispatchGroup.f42782a <= 0) {
            gMAScarDispatchCompleted.run();
        }
    }

    public final void e(Context context, String str, UnityAdFormat unityAdFormat, SignalsHandler signalsHandler) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        SignalsResult signalsResult = new SignalsResult();
        dispatchGroup.a();
        b(context, str, unityAdFormat, dispatchGroup, signalsResult);
        GMAScarDispatchCompleted gMAScarDispatchCompleted = new GMAScarDispatchCompleted(signalsHandler, signalsResult);
        dispatchGroup.f42783b = gMAScarDispatchCompleted;
        if (dispatchGroup.f42782a <= 0) {
            gMAScarDispatchCompleted.run();
        }
    }
}
