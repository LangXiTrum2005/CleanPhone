package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import dirl.sealless;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dirl.preprohormone f21449attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final polloi f21450dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final dirl.beachfront f21451marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f21452saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final adultoid f21453wireman;

    public cutely(Context context, dirl.preprohormone preprohormoneVar, polloi polloiVar, adultoid adultoidVar) {
        this.f21452saneness = context.getPackageName();
        this.f21449attabal = preprohormoneVar;
        this.f21450dern = polloiVar;
        this.f21453wireman = adultoidVar;
        if (dirl.taiyuan.attabal(context)) {
            this.f21451marial = new dirl.beachfront(context, preprohormoneVar, "IntegrityService", apical.f21434attabal, new sealless() { // from class: com.google.android.play.core.integrity.beachfront
                @Override // dirl.sealless
                public final Object attabal(IBinder iBinder) {
                    return dirl.adultoid.apical(iBinder);
                }
            }, null);
        } else {
            preprohormoneVar.attabal("Phonesky is not installed.", new Object[0]);
            this.f21451marial = null;
        }
    }

    public static /* bridge */ /* synthetic */ Bundle attabal(cutely cutelyVar, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", cutelyVar.f21452saneness);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        dirl.monoploid.saneness(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(dirl.monoploid.attabal(arrayList)));
        return bundle;
    }

    public final Task saneness(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f21451marial == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.saneness(), 10);
            Long lAttabal = integrityTokenRequest.attabal();
            if (integrityTokenRequest instanceof kowloon) {
            }
            this.f21449attabal.dern("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f21451marial.graveside(new competently(this, taskCompletionSource, bArrDecode, lAttabal, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
