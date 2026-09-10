package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: ScarAdapterBase.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class taiyuan implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public iridectome.dern f23678attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public astigmatic.attabal f23679dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Map<String, astigmatic.attabal> f23680saneness = new ConcurrentHashMap();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public dern<apical> f23681wireman;

    /* JADX INFO: compiled from: ScarAdapterBase.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Activity f23683kowloon;

        public attabal(Activity activity) {
            this.f23683kowloon = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            taiyuan.this.f23679dern.show(this.f23683kowloon);
        }
    }

    public taiyuan(dern<apical> dernVar) {
        this.f23681wireman = dernVar;
    }

    @Override // com.unity3d.scar.adapter.common.wireman
    public void attabal(Context context, boolean z, iridectome.saneness sanenessVar) {
        this.f23678attabal.attabal(context, z, sanenessVar);
    }

    @Override // com.unity3d.scar.adapter.common.wireman
    public void dern(Context context, String str, UnityAdFormat unityAdFormat, iridectome.saneness sanenessVar) {
        this.f23678attabal.dern(context, str, unityAdFormat, sanenessVar);
    }

    @Override // com.unity3d.scar.adapter.common.wireman
    public void saneness(Context context, List<UnityAdFormat> list, iridectome.saneness sanenessVar) {
        this.f23678attabal.saneness(context, list, sanenessVar);
    }

    @Override // com.unity3d.scar.adapter.common.wireman
    public void show(Activity activity, String str, String str2) {
        astigmatic.attabal attabalVar = this.f23680saneness.get(str2);
        if (attabalVar != null) {
            this.f23679dern = attabalVar;
            cutely.attabal(new attabal(activity));
            return;
        }
        this.f23681wireman.handleError(saneness.beachfront(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }
}
