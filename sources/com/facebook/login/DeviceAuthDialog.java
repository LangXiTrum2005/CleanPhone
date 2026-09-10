package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.applovin.impl.Z;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.UserSettingsManager;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.smartdigimkt.b0.a;
import com.smartdigimkt.k6.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceAuthDialog extends DialogFragment {
    public View X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f16461Y;
    public TextView Z;
    public DeviceAuthMethodHandler e0;
    public volatile GraphRequestAsyncTask g0;
    public volatile ScheduledFuture h0;
    public volatile RequestState i0;
    public final AtomicBoolean f0 = new AtomicBoolean();
    public boolean j0 = false;
    public boolean k0 = false;
    public LoginClient.Request l0 = null;

    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new AnonymousClass1();
        public String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public String f16468Y;
        public String Z;
        public long e0;
        public long f0;

        /* JADX INFO: renamed from: com.facebook.login.DeviceAuthDialog$RequestState$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.Creator<RequestState> {
            @Override // android.os.Parcelable.Creator
            public final RequestState createFromParcel(Parcel parcel) {
                RequestState requestState = new RequestState();
                requestState.X = parcel.readString();
                requestState.f16468Y = parcel.readString();
                requestState.Z = parcel.readString();
                requestState.e0 = parcel.readLong();
                requestState.f0 = parcel.readLong();
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
            parcel.writeString(this.f16468Y);
            parcel.writeString(this.Z);
            parcel.writeLong(this.e0);
            parcel.writeLong(this.f0);
        }
    }

    public static void c(DeviceAuthDialog deviceAuthDialog, final String str, Long l2, Long l3) {
        Date date;
        deviceAuthDialog.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        if (l2.longValue() != 0) {
            date = new Date((l2.longValue() * 1000) + Z.f());
        } else {
            date = null;
        }
        final Date date2 = l3.longValue() != 0 ? new Date(l3.longValue() * 1000) : null;
        final Date date3 = date;
        new GraphRequest(new AccessToken(str, FacebookSdk.c(), "0", null, null, null, null, date, null, date2), "me", bundle, HttpMethod.X, new GraphRequest.Callback() { // from class: com.facebook.login.DeviceAuthDialog.8
            @Override // com.facebook.GraphRequest.Callback
            public final void a(GraphResponse graphResponse) {
                if (DeviceAuthDialog.this.f0.get()) {
                    return;
                }
                FacebookRequestError facebookRequestError = graphResponse.d;
                if (facebookRequestError != null) {
                    DeviceAuthDialog.this.g(facebookRequestError.f15913Y);
                    return;
                }
                try {
                    JSONObject jSONObject = graphResponse.f15952c;
                    final String string = jSONObject.getString("id");
                    final Utility.PermissionsLists permissionsListsW = Utility.w(jSONObject);
                    String string2 = jSONObject.getString("name");
                    DeviceRequestsHelper.a(DeviceAuthDialog.this.i0.f16468Y);
                    if (FetchedAppSettingsManager.b(FacebookSdk.c()).f16297e.contains(SmartLoginOption.RequireConfirm)) {
                        final DeviceAuthDialog deviceAuthDialog2 = DeviceAuthDialog.this;
                        if (!deviceAuthDialog2.k0) {
                            deviceAuthDialog2.k0 = true;
                            final String str2 = str;
                            final Date date4 = date3;
                            final Date date5 = date2;
                            String string3 = deviceAuthDialog2.getResources().getString(com.charging.screenshow.battery.animations.themes.R.string.com_facebook_smart_login_confirmation_title);
                            String string4 = deviceAuthDialog2.getResources().getString(com.charging.screenshow.battery.animations.themes.R.string.com_facebook_smart_login_confirmation_continue_as);
                            String string5 = deviceAuthDialog2.getResources().getString(com.charging.screenshow.battery.animations.themes.R.string.com_facebook_smart_login_confirmation_cancel);
                            String str3 = String.format(string4, string2);
                            AlertDialog.Builder builder = new AlertDialog.Builder(deviceAuthDialog2.getContext());
                            builder.setMessage(string3).setCancelable(true).setNegativeButton(str3, new DialogInterface.OnClickListener() { // from class: com.facebook.login.DeviceAuthDialog.7
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    DeviceAuthDialog.d(DeviceAuthDialog.this, string, permissionsListsW, str2, date4, date5);
                                }
                            }).setPositiveButton(string5, new DialogInterface.OnClickListener() { // from class: com.facebook.login.DeviceAuthDialog.6
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    DeviceAuthDialog deviceAuthDialog3 = DeviceAuthDialog.this;
                                    deviceAuthDialog3.getDialog().setContentView(deviceAuthDialog3.e(false));
                                    deviceAuthDialog3.k(deviceAuthDialog3.l0);
                                }
                            });
                            builder.create().show();
                            return;
                        }
                    }
                    DeviceAuthDialog.d(DeviceAuthDialog.this, string, permissionsListsW, str, date3, date2);
                } catch (JSONException e2) {
                    DeviceAuthDialog.this.g(new FacebookException(e2));
                }
            }
        }).d();
    }

    public static void d(DeviceAuthDialog deviceAuthDialog, String str, Utility.PermissionsLists permissionsLists, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = deviceAuthDialog.e0;
        String strC = FacebookSdk.c();
        ArrayList arrayList = permissionsLists.f16381a;
        AccessTokenSource accessTokenSource = AccessTokenSource.DEVICE_AUTH;
        deviceAuthMethodHandler.getClass();
        AccessToken accessToken = new AccessToken(str2, strC, str, arrayList, permissionsLists.f16382b, permissionsLists.f16383c, accessTokenSource, date, null, date2);
        LoginClient loginClient = deviceAuthMethodHandler.f16503Y;
        loginClient.e(new LoginClient.Result(loginClient.h0, LoginClient.Result.Code.SUCCESS, accessToken, null, null, null));
        deviceAuthDialog.getDialog().dismiss();
    }

    public final View e(boolean z2) {
        View viewInflate = getActivity().getLayoutInflater().inflate(z2 ? com.charging.screenshow.battery.animations.themes.R.layout.com_facebook_smart_device_dialog_fragment : com.charging.screenshow.battery.animations.themes.R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.X = viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.progress_bar);
        this.f16461Y = (TextView) viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.confirmation_code);
        ((Button) viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.DeviceAuthDialog.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    DeviceAuthDialog.this.f();
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                }
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.com_facebook_device_auth_instructions);
        this.Z = textView;
        textView.setText(Html.fromHtml(getString(com.charging.screenshow.battery.animations.themes.R.string.com_facebook_device_auth_instructions)));
        return viewInflate;
    }

    public final void f() {
        if (this.f0.compareAndSet(false, true)) {
            if (this.i0 != null) {
                DeviceRequestsHelper.a(this.i0.f16468Y);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.e0;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.f16503Y.e(LoginClient.Result.a(deviceAuthMethodHandler.f16503Y.h0, "User canceled log in."));
            }
            getDialog().dismiss();
        }
    }

    public final void g(FacebookException facebookException) {
        if (this.f0.compareAndSet(false, true)) {
            if (this.i0 != null) {
                DeviceRequestsHelper.a(this.i0.f16468Y);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.e0;
            deviceAuthMethodHandler.f16503Y.e(LoginClient.Result.b(deviceAuthMethodHandler.f16503Y.h0, null, facebookException.getMessage(), null));
            getDialog().dismiss();
        }
    }

    public final void h() {
        this.i0.f0 = Z.f();
        Bundle bundle = new Bundle();
        bundle.putString("code", this.i0.Z);
        this.g0 = new GraphRequest(null, "device/login_status", bundle, HttpMethod.f15953Y, new GraphRequest.Callback() { // from class: com.facebook.login.DeviceAuthDialog.5
            @Override // com.facebook.GraphRequest.Callback
            public final void a(GraphResponse graphResponse) {
                if (DeviceAuthDialog.this.f0.get()) {
                    return;
                }
                FacebookRequestError facebookRequestError = graphResponse.d;
                if (facebookRequestError == null) {
                    try {
                        JSONObject jSONObject = graphResponse.f15952c;
                        DeviceAuthDialog.c(DeviceAuthDialog.this, jSONObject.getString("access_token"), Long.valueOf(jSONObject.getLong("expires_in")), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        return;
                    } catch (JSONException e2) {
                        DeviceAuthDialog.this.g(new FacebookException(e2));
                        return;
                    }
                }
                int i2 = facebookRequestError.f0;
                if (i2 != 1349152) {
                    switch (i2) {
                        case 1349172:
                        case 1349174:
                            DeviceAuthDialog.this.i();
                            break;
                        case 1349173:
                            DeviceAuthDialog.this.f();
                            break;
                        default:
                            DeviceAuthDialog.this.g(facebookRequestError.f15913Y);
                            break;
                    }
                    return;
                }
                if (DeviceAuthDialog.this.i0 != null) {
                    DeviceRequestsHelper.a(DeviceAuthDialog.this.i0.f16468Y);
                }
                DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                LoginClient.Request request = deviceAuthDialog.l0;
                if (request != null) {
                    deviceAuthDialog.k(request);
                } else {
                    deviceAuthDialog.f();
                }
            }
        }).d();
    }

    public final void i() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            try {
                if (DeviceAuthMethodHandler.Z == null) {
                    DeviceAuthMethodHandler.Z = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = DeviceAuthMethodHandler.Z;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.h0 = scheduledThreadPoolExecutor.schedule(new Runnable() { // from class: com.facebook.login.DeviceAuthDialog.4
            @Override // java.lang.Runnable
            public final void run() {
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    DeviceAuthDialog.this.h();
                } catch (Throwable th2) {
                    CrashShieldHandler.a(this, th2);
                }
            }
        }, this.i0.e0, TimeUnit.SECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    public final void j(RequestState requestState) {
        Bitmap bitmapCreateBitmap;
        boolean zD;
        this.i0 = requestState;
        this.f16461Y.setText(requestState.f16468Y);
        String str = requestState.X;
        HashMap map = DeviceRequestsHelper.f16232a;
        if (CrashShieldHandler.b(DeviceRequestsHelper.class)) {
            bitmapCreateBitmap = null;
        } else {
            try {
                EnumMap enumMap = new EnumMap(EncodeHintType.class);
                enumMap.put(EncodeHintType.Z, 2);
                try {
                    BitMatrix bitMatrixA = new MultiFormatWriter().a(str, BarcodeFormat.f21331Y, enumMap);
                    int i2 = bitMatrixA.f21346Y;
                    int i3 = bitMatrixA.X;
                    int[] iArr = new int[i2 * i3];
                    for (int i4 = 0; i4 < i2; i4++) {
                        int i5 = i4 * i3;
                        for (int i6 = 0; i6 < i3; i6++) {
                            iArr[i5 + i6] = bitMatrixA.b(i6, i4) ? -16777216 : -1;
                        }
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                    try {
                        bitmapCreateBitmap.setPixels(iArr, 0, i3, 0, 0, i3, i2);
                    } catch (WriterException unused) {
                    }
                } catch (WriterException unused2) {
                    bitmapCreateBitmap = null;
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(DeviceRequestsHelper.class, th);
            }
        }
        this.Z.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(getResources(), bitmapCreateBitmap), (Drawable) null, (Drawable) null);
        this.f16461Y.setVisibility(0);
        this.X.setVisibility(8);
        if (!this.k0) {
            String str2 = requestState.f16468Y;
            if (CrashShieldHandler.b(DeviceRequestsHelper.class)) {
                zD = false;
            } else {
                try {
                    if (DeviceRequestsHelper.c()) {
                        zD = DeviceRequestsHelper.d(str2);
                    } else {
                        zD = false;
                    }
                } catch (Throwable th2) {
                    CrashShieldHandler.a(DeviceRequestsHelper.class, th2);
                }
            }
            if (zD) {
                InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(getContext());
                HashSet hashSet = FacebookSdk.f15915a;
                if (UserSettingsManager.c()) {
                    internalAppEventsLogger.f16027a.f(null, "fb_smart_login_service");
                }
            }
        }
        if (requestState.f0 != 0 && (Z.f() - requestState.f0) - (requestState.e0 * 1000) < 0) {
            i();
        } else {
            h();
        }
    }

    public final void k(LoginClient.Request request) {
        this.l0 = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.f16476Y));
        String str = request.h0;
        if (str != null) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = request.j0;
        if (str2 != null) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(FacebookSdk.c());
        sb.append(a.U1);
        Validate.h();
        String str3 = FacebookSdk.f15918e;
        if (str3 == null) {
            throw new IllegalStateException("No Client Token found, please set the Client Token.");
        }
        sb.append(str3);
        bundle.putString("access_token", sb.toString());
        bundle.putString(b.c.d, DeviceRequestsHelper.b());
        new GraphRequest(null, "device/login", bundle, HttpMethod.f15953Y, new GraphRequest.Callback() { // from class: com.facebook.login.DeviceAuthDialog.2
            @Override // com.facebook.GraphRequest.Callback
            public final void a(GraphResponse graphResponse) {
                DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                if (deviceAuthDialog.j0) {
                    return;
                }
                FacebookRequestError facebookRequestError = graphResponse.d;
                if (facebookRequestError != null) {
                    deviceAuthDialog.g(facebookRequestError.f15913Y);
                    return;
                }
                JSONObject jSONObject = graphResponse.f15952c;
                RequestState requestState = new RequestState();
                try {
                    String string = jSONObject.getString("user_code");
                    requestState.f16468Y = string;
                    requestState.X = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", string);
                    requestState.Z = jSONObject.getString("code");
                    requestState.e0 = jSONObject.getLong("interval");
                    deviceAuthDialog.j(requestState);
                } catch (JSONException e2) {
                    deviceAuthDialog.g(new FacebookException(e2));
                }
            }
        }).d();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getActivity()) { // from class: com.facebook.login.DeviceAuthDialog.1
            @Override // android.app.Dialog
            public final void onBackPressed() {
                DeviceAuthDialog.this.getClass();
                super.onBackPressed();
            }
        };
        dialog.setContentView(e(DeviceRequestsHelper.c() && !this.k0));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.e0 = (DeviceAuthMethodHandler) ((LoginFragment) ((FacebookActivity) getActivity()).f15910Y).f16481Y.f();
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            j(requestState);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.j0 = true;
        this.f0.set(true);
        super.onDestroyView();
        if (this.g0 != null) {
            this.g0.cancel(true);
        }
        if (this.h0 != null) {
            this.h0.cancel(true);
        }
        this.X = null;
        this.f16461Y = null;
        this.Z = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.j0) {
            return;
        }
        f();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.i0 != null) {
            bundle.putParcelable("request_state", this.i0);
        }
    }
}
