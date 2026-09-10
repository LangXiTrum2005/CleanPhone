package com.unity3d.scar.adapter.common.signals;

import android.content.Context;
import com.unity3d.scar.adapter.common.DispatchGroup;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;

/* JADX INFO: loaded from: classes6.dex */
public interface ISignalsCollector {
    void a(Context context, UnityAdFormat unityAdFormat, DispatchGroup dispatchGroup, SignalsResult signalsResult);

    void b(Context context, String str, UnityAdFormat unityAdFormat, DispatchGroup dispatchGroup, SignalsResult signalsResult);
}
