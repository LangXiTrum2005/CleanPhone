package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.mbridge.msdk.foundation.download.Command;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "Category", "Companion", Command.HTTP_HEADER_RANGE, "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookRequestError implements Parcelable {
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final FacebookException f15913Y;
    public final int Z;
    public final int e0;
    public final int f0;
    public final String g0;
    public final String h0;
    public final String i0;
    public final JSONObject j0;
    public final Object k0;
    public static final Companion l0 = new Companion();
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new FacebookRequestError$Companion$CREATOR$1();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookRequestError$Category;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Category {
        public static final Category X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Category f15914Y;
        public static final Category Z;
        public static final /* synthetic */ Category[] e0;

        static {
            Category category = new Category("LOGIN_RECOVERABLE", 0);
            X = category;
            Category category2 = new Category("OTHER", 1);
            f15914Y = category2;
            Category category3 = new Category("TRANSIENT", 2);
            Z = category3;
            e0 = new Category[]{category, category2, category3};
        }

        public static Category valueOf(String str) {
            return (Category) Enum.valueOf(Category.class, str);
        }

        public static Category[] values() {
            return (Category[]) e0.clone();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/facebook/FacebookRequestError$Companion;", "", "", "BODY_KEY", "Ljava/lang/String;", "CODE_KEY", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/FacebookRequestError;", "CREATOR", "Landroid/os/Parcelable$Creator;", "ERROR_CODE_FIELD_KEY", "ERROR_CODE_KEY", "ERROR_IS_TRANSIENT_KEY", "ERROR_KEY", "ERROR_MESSAGE_FIELD_KEY", "ERROR_MSG_KEY", "ERROR_REASON_KEY", "ERROR_SUB_CODE_KEY", "ERROR_TYPE_FIELD_KEY", "ERROR_USER_MSG_KEY", "ERROR_USER_TITLE_KEY", "", "INVALID_ERROR_CODE", "I", "INVALID_HTTP_STATUS_CODE", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public final synchronized FacebookRequestErrorClassification a() {
            FetchedAppSettings fetchedAppSettingsB = FetchedAppSettingsManager.b(FacebookSdk.c());
            if (fetchedAppSettingsB != null) {
                return fetchedAppSettingsB.f16298h;
            }
            return FacebookRequestErrorClassification.f16279e.a();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookRequestError$Range;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Range {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    public FacebookRequestError(int i2, int i3, int i4, String str, String str2, String str3, String str4, JSONObject jSONObject, Object obj, FacebookException facebookException, boolean z2) {
        Set set;
        Set set2;
        Set set3;
        this.Z = i2;
        this.e0 = i3;
        this.f0 = i4;
        this.g0 = str;
        this.h0 = str3;
        this.i0 = str4;
        this.j0 = jSONObject;
        this.k0 = obj;
        this.X = str2;
        Companion companion = l0;
        Category category = Category.f15914Y;
        if (facebookException != null) {
            this.f15913Y = facebookException;
        } else {
            this.f15913Y = new FacebookServiceException(this, a());
            FacebookRequestErrorClassification facebookRequestErrorClassificationA = companion.a();
            Category category2 = Category.Z;
            if (z2) {
                category = category2;
            } else {
                HashMap map = facebookRequestErrorClassificationA.f16280a;
                if (map == null || !map.containsKey(Integer.valueOf(i3)) || ((set3 = (Set) map.get(Integer.valueOf(i3))) != null && !set3.contains(Integer.valueOf(i4)))) {
                    HashMap map2 = facebookRequestErrorClassificationA.f16282c;
                    if (map2 != null && map2.containsKey(Integer.valueOf(i3)) && ((set2 = (Set) map2.get(Integer.valueOf(i3))) == null || set2.contains(Integer.valueOf(i4)))) {
                        category = Category.X;
                    } else {
                        HashMap map3 = facebookRequestErrorClassificationA.f16281b;
                        if (map3 != null && map3.containsKey(Integer.valueOf(i3)) && ((set = (Set) map3.get(Integer.valueOf(i3))) == null || set.contains(Integer.valueOf(i4)))) {
                            category = category2;
                        }
                    }
                }
            }
        }
        companion.a();
        category.ordinal();
    }

    public final String a() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.f15913Y;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.Z + ", errorCode: " + this.e0 + ", subErrorCode: " + this.f0 + ", errorType: " + this.g0 + ", errorMessage: " + a() + "}";
        Intrinsics.e(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i2) {
        Intrinsics.f(out, "out");
        out.writeInt(this.Z);
        out.writeInt(this.e0);
        out.writeInt(this.f0);
        out.writeString(this.g0);
        out.writeString(a());
        out.writeString(this.h0);
        out.writeString(this.i0);
    }

    public FacebookRequestError(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(int i2, String str, String str2) {
        this(-1, i2, -1, str, str2, null, null, null, null, null, false);
    }
}
