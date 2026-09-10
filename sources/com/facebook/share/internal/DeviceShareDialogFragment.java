package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.charging.screenshow.battery.animations.themes.R;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.smartdigimkt.b0.a;
import com.smartdigimkt.k6.b;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DeviceShareDialogFragment extends DialogFragment {
    public static ScheduledThreadPoolExecutor h0;
    public ProgressBar X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f16531Y;
    public Dialog Z;
    public volatile RequestState e0;
    public volatile ScheduledFuture f0;
    public ShareContent g0;

    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new AnonymousClass1();
        public String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public long f16533Y;

        /* JADX INFO: renamed from: com.facebook.share.internal.DeviceShareDialogFragment$RequestState$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.Creator<RequestState> {
            @Override // android.os.Parcelable.Creator
            public final RequestState createFromParcel(Parcel parcel) {
                RequestState requestState = new RequestState();
                requestState.X = parcel.readString();
                requestState.f16533Y = parcel.readLong();
                return requestState;
            }

            @Override // android.os.Parcelable.Creator
            public final RequestState[] newArray(int i2) {
                return new RequestState[i2];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.X);
            parcel.writeLong(this.f16533Y);
        }
    }

    public final void c(Intent intent) {
        if (this.e0 != null) {
            DeviceRequestsHelper.a(this.e0.X);
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(getContext(), facebookRequestError.a(), 0).show();
        }
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public final void d(FacebookRequestError facebookRequestError) {
        if (isAdded()) {
            FragmentTransaction fragmentTransactionD = getFragmentManager().d();
            fragmentTransactionD.j(this);
            fragmentTransactionD.c();
        }
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        c(intent);
    }

    public final void e(RequestState requestState) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        this.e0 = requestState;
        this.f16531Y.setText(requestState.X);
        this.f16531Y.setVisibility(0);
        this.X.setVisibility(8);
        synchronized (DeviceShareDialogFragment.class) {
            try {
                if (h0 == null) {
                    h0 = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = h0;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f0 = scheduledThreadPoolExecutor.schedule(new Runnable() { // from class: com.facebook.share.internal.DeviceShareDialogFragment.3
            @Override // java.lang.Runnable
            public final void run() {
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    DeviceShareDialogFragment.this.Z.dismiss();
                } catch (Throwable th2) {
                    CrashShieldHandler.a(this, th2);
                }
            }
        }, requestState.f16533Y, TimeUnit.SECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0065  */
    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle bundleB;
        Bundle bundle2;
        this.Z = new Dialog(getActivity(), R.style.com_facebook_auth_dialog);
        String strB = null;
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.X = (ProgressBar) viewInflate.findViewById(R.id.progress_bar);
        this.f16531Y = (TextView) viewInflate.findViewById(R.id.confirmation_code);
        ((Button) viewInflate.findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.share.internal.DeviceShareDialogFragment.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    DeviceShareDialogFragment.this.Z.dismiss();
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                }
            }
        });
        ((TextView) viewInflate.findViewById(R.id.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        this.Z.setContentView(viewInflate);
        ShareContent shareContent = this.g0;
        if (shareContent != null) {
            if (shareContent instanceof ShareLinkContent) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                bundleB = WebDialogParameters.d(shareLinkContent);
                Uri uri = shareLinkContent.X;
                if (uri != null) {
                    Utility.O(bundleB, "href", uri.toString());
                }
                Utility.O(bundleB, "quote", shareLinkContent.k0);
            } else if (shareContent instanceof ShareOpenGraphContent) {
                bundleB = WebDialogParameters.b((ShareOpenGraphContent) shareContent);
            } else {
                bundle2 = null;
            }
            bundle2 = bundleB;
        } else {
            bundle2 = null;
        }
        if (bundle2 == null || bundle2.size() == 0) {
            d(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(FacebookSdk.c());
        sb.append(a.U1);
        Validate.h();
        String str = FacebookSdk.f15918e;
        if (str == null) {
            throw new IllegalStateException("No Client Token found, please set the Client Token.");
        }
        sb.append(str);
        bundle2.putString("access_token", sb.toString());
        HashMap map = DeviceRequestsHelper.f16232a;
        if (!CrashShieldHandler.b(DeviceRequestsHelper.class)) {
            try {
                strB = DeviceRequestsHelper.b();
            } catch (Throwable th) {
                CrashShieldHandler.a(DeviceRequestsHelper.class, th);
            }
        }
        bundle2.putString(b.c.d, strB);
        new GraphRequest(null, "device/share", bundle2, HttpMethod.f15953Y, new GraphRequest.Callback() { // from class: com.facebook.share.internal.DeviceShareDialogFragment.2
            @Override // com.facebook.GraphRequest.Callback
            public final void a(GraphResponse graphResponse) {
                FacebookRequestError facebookRequestError = graphResponse.d;
                DeviceShareDialogFragment deviceShareDialogFragment = DeviceShareDialogFragment.this;
                if (facebookRequestError != null) {
                    deviceShareDialogFragment.d(facebookRequestError);
                    return;
                }
                JSONObject jSONObject = graphResponse.f15952c;
                RequestState requestState = new RequestState();
                try {
                    requestState.X = jSONObject.getString("user_code");
                    requestState.f16533Y = jSONObject.getLong("expires_in");
                    deviceShareDialogFragment.e(requestState);
                } catch (JSONException unused) {
                    deviceShareDialogFragment.d(new FacebookRequestError(0, "", "Malformed server response"));
                }
            }
        }).d();
        return this.Z;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            e(requestState);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f0 != null) {
            this.f0.cancel(true);
        }
        c(new Intent());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.e0 != null) {
            bundle.putParcelable("request_state", this.e0);
        }
    }
}
