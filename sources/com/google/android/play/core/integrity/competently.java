package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.af;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class competently extends dirl.cord {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ byte[] f21438arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final /* synthetic */ cutely f21439graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f21440molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final /* synthetic */ Long f21441monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f21442polloi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public competently(cutely cutelyVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f21439graveside = cutelyVar;
        this.f21438arytenoidectomy = bArr;
        this.f21441monoploid = l;
        this.f21442polloi = taskCompletionSource2;
        this.f21440molybdenite = integrityTokenRequest;
    }

    @Override // dirl.cord
    public final void attabal(Exception exc) {
        if (exc instanceof af) {
            super.attabal(new IntegrityServiceException(-9, exc));
        } else {
            super.attabal(exc);
        }
    }

    @Override // dirl.cord
    public final void saneness() {
        try {
            ((dirl.dovishness) this.f21439graveside.f21451marial.marial()).beachfront(cutely.attabal(this.f21439graveside, this.f21438arytenoidectomy, this.f21441monoploid, null), new taiyuan(this.f21439graveside, this.f21442polloi));
        } catch (RemoteException e) {
            this.f21439graveside.f21449attabal.saneness(e, "requestIntegrityToken(%s)", this.f21440molybdenite);
            this.f21442polloi.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
