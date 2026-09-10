package com.unity3d.ads.core.data.datasource;

import ak.f;
import android.database.ContentObserver;
import android.provider.Settings;
import ck.e;
import ck.i;
import com.ironsource.mediationsdk.logger.IronSourceError;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.z;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len/r;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "Lwj/r;", "<anonymous>", "(Len/r;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", l = {IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL}, m = "invokeSuspend")
public final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends i implements c {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends o implements jk.a {
        final /* synthetic */ AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 $contentObserver;
        final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1) {
            super(0);
            this.this$0 = androidDynamicDeviceInfoDataSource;
            this.$contentObserver = androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1;
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3198invoke();
            return r.f53297a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3198invoke() {
            this.this$0.getContext().getContentResolver().unregisterContentObserver(this.$contentObserver);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, f fVar) {
        super(2, fVar);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, fVar);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    @Override // jk.c
    public final Object invoke(en.r rVar, f fVar) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(rVar, fVar)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.database.ContentObserver, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1] */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 == 0) {
            t9.e.z(obj);
            final en.r rVar = (en.r) this.L$0;
            final z zVar = new z();
            double streamVolume = this.this$0.getStreamVolume(3);
            zVar.f44767a = streamVolume;
            t9.e.B(rVar, new VolumeSettingsChange.VolumeChange(streamVolume));
            final a0 a0Var = new a0();
            int ringerMode = this.this$0.getRingerMode();
            a0Var.f44754a = ringerMode;
            t9.e.B(rVar, new VolumeSettingsChange.MuteChange(ringerMode == 0));
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            ?? r3 = new ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean selfChange) {
                    super.onChange(selfChange);
                    double streamVolume2 = androidDynamicDeviceInfoDataSource.getStreamVolume(3);
                    z zVar2 = zVar;
                    if (streamVolume2 != zVar2.f44767a) {
                        zVar2.f44767a = streamVolume2;
                        t9.e.B(rVar, new VolumeSettingsChange.VolumeChange(streamVolume2));
                    }
                    int ringerMode2 = androidDynamicDeviceInfoDataSource.getRingerMode();
                    a0 a0Var2 = a0Var;
                    if (ringerMode2 != a0Var2.f44754a) {
                        a0Var2.f44754a = ringerMode2;
                        t9.e.B(rVar, new VolumeSettingsChange.MuteChange(ringerMode2 == 0));
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r3);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, r3);
            this.label = 1;
            Object objA = x7.a.a(rVar, anonymousClass1, this);
            bk.a aVar = bk.a.f5708a;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
        }
        return r.f53297a;
    }
}
