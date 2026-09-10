package com.facebook.share.internal;

import android.os.Bundle;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.p004ironsource.d9;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class WebDialogParameters {

    /* JADX INFO: renamed from: com.facebook.share.internal.WebDialogParameters$1, reason: invalid class name */
    final class AnonymousClass1 implements Utility.Mapper<SharePhoto, String> {
        @Override // com.facebook.internal.Utility.Mapper
        public final Object apply(Object obj) {
            return ((SharePhoto) obj).Z.toString();
        }
    }

    public static Bundle a(GameRequestContent gameRequestContent) {
        Bundle bundle = new Bundle();
        Utility.O(bundle, PglCryptUtils.KEY_MESSAGE, gameRequestContent.X);
        Utility.M("to", gameRequestContent.Z, bundle);
        Utility.O(bundle, "title", gameRequestContent.e0);
        Utility.O(bundle, "data", gameRequestContent.f0);
        GameRequestContent.ActionType actionType = gameRequestContent.g0;
        if (actionType != null) {
            Utility.O(bundle, "action_type", actionType.toString().toLowerCase(Locale.ENGLISH));
        }
        Utility.O(bundle, "object_id", gameRequestContent.h0);
        GameRequestContent.Filters filters = gameRequestContent.i0;
        if (filters != null) {
            Utility.O(bundle, "filters", filters.toString().toLowerCase(Locale.ENGLISH));
        }
        Utility.M("suggestions", gameRequestContent.j0, bundle);
        return bundle;
    }

    public static Bundle b(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle bundleD = d(shareOpenGraphContent);
        Utility.O(bundleD, "action_type", shareOpenGraphContent.h0.X.getString("og:type"));
        try {
            JSONObject jSONObjectO = ShareInternalUtility.o(ShareInternalUtility.q(shareOpenGraphContent), false);
            if (jSONObjectO != null) {
                Utility.O(bundleD, "action_properties", jSONObjectO.toString());
            }
            return bundleD;
        } catch (JSONException e2) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e2);
        }
    }

    public static Bundle c(SharePhotoContent sharePhotoContent) {
        Bundle bundleD = d(sharePhotoContent);
        List list = sharePhotoContent.h0;
        String[] strArr = new String[list.size()];
        Utility.I(list, new AnonymousClass1()).toArray(strArr);
        bundleD.putStringArray(d9.h.I0, strArr);
        return bundleD;
    }

    public static Bundle d(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag shareHashtag = shareContent.g0;
        if (shareHashtag != null) {
            Utility.O(bundle, "hashtag", shareHashtag.X);
        }
        return bundle;
    }
}
