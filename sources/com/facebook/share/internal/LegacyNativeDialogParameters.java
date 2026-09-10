package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class LegacyNativeDialogParameters {
    public static Bundle a(UUID uuid, ShareContent shareContent) {
        Validate.f(shareContent, "shareContent");
        Validate.f(uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            Bundle bundleB = b(shareLinkContent);
            Utility.O(bundleB, "com.facebook.platform.extra.TITLE", shareLinkContent.i0);
            Utility.O(bundleB, "com.facebook.platform.extra.DESCRIPTION", shareLinkContent.h0);
            Uri uri = shareLinkContent.j0;
            if (uri != null) {
                Utility.O(bundleB, "com.facebook.platform.extra.IMAGE", uri.toString());
            }
            return bundleB;
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            ArrayList arrayListD = ShareInternalUtility.d(sharePhotoContent, uuid);
            Bundle bundleB2 = b(sharePhotoContent);
            bundleB2.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(arrayListD));
            return bundleB2;
        }
        if (shareContent instanceof ShareVideoContent) {
            return null;
        }
        if (!(shareContent instanceof ShareOpenGraphContent)) {
            return null;
        }
        ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
        try {
            JSONObject jSONObjectP = ShareInternalUtility.p(uuid, shareOpenGraphContent);
            Bundle bundleB3 = b(shareOpenGraphContent);
            Utility.O(bundleB3, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareOpenGraphContent.i0);
            Utility.O(bundleB3, "com.facebook.platform.extra.ACTION_TYPE", shareOpenGraphContent.h0.X.getString("og:type"));
            Utility.O(bundleB3, "com.facebook.platform.extra.ACTION", jSONObjectP.toString());
            return bundleB3;
        } catch (JSONException e2) {
            throw new FacebookException("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e2.getMessage());
        }
    }

    public static Bundle b(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        Uri uri = shareContent.X;
        if (uri != null) {
            Utility.O(bundle, "com.facebook.platform.extra.LINK", uri.toString());
        }
        Utility.O(bundle, "com.facebook.platform.extra.PLACE", shareContent.Z);
        Utility.O(bundle, "com.facebook.platform.extra.REF", shareContent.f0);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", false);
        List list = shareContent.f16612Y;
        if (!Utility.D(list)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(list));
        }
        return bundle;
    }
}
