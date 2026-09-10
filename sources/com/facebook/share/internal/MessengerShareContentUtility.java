package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.p004ironsource.d9;
import com.smartdigimkt.o1.b;
import com.smartdigimkt.x.d;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class MessengerShareContentUtility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f16585a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    /* JADX INFO: renamed from: com.facebook.share.internal.MessengerShareContentUtility$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16586a;

        static {
            try {
                new int[ShareMessengerMediaTemplateContent.MediaType.values().length][1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                new int[ShareMessengerGenericTemplateContent.ImageAspectRatio.values().length][1] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr = new int[ShareMessengerURLActionButton.WebviewHeightRatio.values().length];
            f16586a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16586a[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(Bundle bundle, ShareMessengerActionButton shareMessengerActionButton, boolean z2) {
        if (CrashShieldHandler.b(MessengerShareContentUtility.class) || shareMessengerActionButton == null) {
            return;
        }
        try {
            if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                e(bundle, (ShareMessengerURLActionButton) shareMessengerActionButton, z2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th);
        }
    }

    public static void b(Bundle bundle, ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) {
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return;
        }
        try {
            ShareMessengerActionButton shareMessengerActionButton = shareMessengerGenericTemplateElement.f0;
            if (shareMessengerActionButton != null) {
                a(bundle, shareMessengerActionButton, false);
            } else {
                ShareMessengerActionButton shareMessengerActionButton2 = shareMessengerGenericTemplateElement.e0;
                if (shareMessengerActionButton2 != null) {
                    a(bundle, shareMessengerActionButton2, true);
                }
            }
            Uri uri = shareMessengerGenericTemplateElement.Z;
            if (uri != null) {
                Utility.O(bundle, "IMAGE", uri.toString());
            }
            Utility.O(bundle, "PREVIEW_TYPE", "DEFAULT");
            Utility.O(bundle, "TITLE", shareMessengerGenericTemplateElement.X);
            Utility.O(bundle, "SUBTITLE", shareMessengerGenericTemplateElement.f16620Y);
        } catch (Throwable th) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th);
        }
    }

    public static void c(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return;
        }
        try {
            a(bundle, shareMessengerMediaTemplateContent.k0, false);
            Utility.O(bundle, "PREVIEW_TYPE", "DEFAULT");
            Utility.O(bundle, "ATTACHMENT_ID", shareMessengerMediaTemplateContent.i0);
            Uri uri = shareMessengerMediaTemplateContent.j0;
            if (uri != null) {
                String str = null;
                if (!CrashShieldHandler.b(MessengerShareContentUtility.class)) {
                    try {
                        String host = uri.getHost();
                        str = (Utility.C(host) || !f16585a.matcher(host).matches()) ? "IMAGE" : "uri";
                    } catch (Throwable th) {
                        CrashShieldHandler.a(MessengerShareContentUtility.class, th);
                    }
                }
                Utility.O(bundle, str, uri.toString());
            }
            Utility.O(bundle, "type", f(shareMessengerMediaTemplateContent.h0));
        } catch (Throwable th2) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th2);
        }
    }

    public static void d(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return;
        }
        try {
            if (!CrashShieldHandler.b(MessengerShareContentUtility.class)) {
                try {
                    a(bundle, shareMessengerOpenGraphMusicTemplateContent.i0, false);
                    Utility.O(bundle, "PREVIEW_TYPE", "OPEN_GRAPH");
                    Uri uri = shareMessengerOpenGraphMusicTemplateContent.h0;
                    if (uri != null) {
                        Utility.O(bundle, "OPEN_GRAPH_URL", uri.toString());
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.a(MessengerShareContentUtility.class, th);
                }
            }
            Utility.N(bundle, "MESSENGER_PLATFORM_CONTENT", m(shareMessengerOpenGraphMusicTemplateContent));
        } catch (Throwable th2) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th2);
        }
    }

    public static void e(Bundle bundle, ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z2) {
        String strV;
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return;
        }
        try {
            if (z2) {
                strV = Utility.v(shareMessengerURLActionButton.f16621Y);
            } else {
                strV = shareMessengerURLActionButton.X + " - " + Utility.v(shareMessengerURLActionButton.f16621Y);
            }
            Utility.O(bundle, "TARGET_DISPLAY", strV);
            Uri uri = shareMessengerURLActionButton.f16621Y;
            if (uri != null) {
                Utility.O(bundle, "ITEM_URL", uri.toString());
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th);
        }
    }

    public static String f(ShareMessengerMediaTemplateContent.MediaType mediaType) {
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return null;
        }
        if (mediaType == null) {
            return d.c.k;
        }
        try {
            return mediaType.ordinal() != 1 ? d.c.k : "video";
        } catch (Throwable th) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th);
            return null;
        }
    }

    public static JSONObject g(ShareMessengerActionButton shareMessengerActionButton) {
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            return h(shareMessengerActionButton, false);
        } catch (Throwable th) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th);
            return null;
        }
    }

    public static JSONObject h(ShareMessengerActionButton shareMessengerActionButton, boolean z2) {
        if (!CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            try {
                if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                    return o((ShareMessengerURLActionButton) shareMessengerActionButton, z2);
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(MessengerShareContentUtility.class, th);
                return null;
            }
        }
        return null;
    }

    public static JSONObject i(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        String str;
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            JSONArray jSONArrayPut = new JSONArray().put(j(shareMessengerGenericTemplateContent.j0));
            JSONObject jSONObjectPut = new JSONObject().put("template_type", "generic").put("sharable", shareMessengerGenericTemplateContent.h0);
            ShareMessengerGenericTemplateContent.ImageAspectRatio imageAspectRatio = shareMessengerGenericTemplateContent.i0;
            if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
                str = null;
            } else {
                str = "horizontal";
                if (imageAspectRatio != null) {
                    try {
                        if (imageAspectRatio.ordinal() == 1) {
                            str = "square";
                        }
                    } catch (Throwable th) {
                        CrashShieldHandler.a(MessengerShareContentUtility.class, th);
                        str = null;
                    }
                }
            }
            return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", jSONObjectPut.put("image_aspect_ratio", str).put("elements", jSONArrayPut)));
        } catch (Throwable th2) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th2);
            return null;
        }
    }

    public static JSONObject j(ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) {
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("title", shareMessengerGenericTemplateElement.X).put("subtitle", shareMessengerGenericTemplateElement.f16620Y).put("image_url", Utility.v(shareMessengerGenericTemplateElement.Z));
            ShareMessengerActionButton shareMessengerActionButton = shareMessengerGenericTemplateElement.f0;
            if (shareMessengerActionButton != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(g(shareMessengerActionButton));
                jSONObjectPut.put("buttons", jSONArray);
            }
            ShareMessengerActionButton shareMessengerActionButton2 = shareMessengerGenericTemplateElement.e0;
            if (shareMessengerActionButton2 != null) {
                jSONObjectPut.put("default_action", h(shareMessengerActionButton2, true));
            }
            return jSONObjectPut;
        } catch (Throwable th) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th);
            return null;
        }
    }

    public static JSONObject k(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", d9.h.I0).put("elements", new JSONArray().put(l(shareMessengerMediaTemplateContent)))));
        } catch (Throwable th) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th);
            return null;
        }
    }

    public static JSONObject l(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("attachment_id", shareMessengerMediaTemplateContent.i0).put("url", Utility.v(shareMessengerMediaTemplateContent.j0)).put("media_type", f(shareMessengerMediaTemplateContent.h0));
            ShareMessengerActionButton shareMessengerActionButton = shareMessengerMediaTemplateContent.k0;
            if (shareMessengerActionButton == null) {
                return jSONObjectPut;
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(g(shareMessengerActionButton));
            jSONObjectPut.put("buttons", jSONArray);
            return jSONObjectPut;
        } catch (Throwable th) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th);
            return null;
        }
    }

    public static JSONObject m(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "open_graph").put("elements", new JSONArray().put(n(shareMessengerOpenGraphMusicTemplateContent)))));
        } catch (Throwable th) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th);
            return null;
        }
    }

    public static JSONObject n(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("url", Utility.v(shareMessengerOpenGraphMusicTemplateContent.h0));
            ShareMessengerActionButton shareMessengerActionButton = shareMessengerOpenGraphMusicTemplateContent.i0;
            if (shareMessengerActionButton == null) {
                return jSONObjectPut;
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(g(shareMessengerActionButton));
            jSONObjectPut.put("buttons", jSONArray);
            return jSONObjectPut;
        } catch (Throwable th) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    public static JSONObject o(ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z2) {
        String str;
        String str2;
        if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("type", "web_url").put("title", z2 ? null : shareMessengerURLActionButton.X).put("url", Utility.v(shareMessengerURLActionButton.f16621Y));
            ShareMessengerURLActionButton.WebviewHeightRatio webviewHeightRatio = shareMessengerURLActionButton.g0;
            if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
                str = null;
            } else {
                str = b.x0;
                if (webviewHeightRatio != null) {
                    try {
                        int iOrdinal = webviewHeightRatio.ordinal();
                        if (iOrdinal == 1) {
                            str = "tall";
                        } else if (iOrdinal == 2) {
                            str = "compact";
                        }
                    } catch (Throwable th) {
                        CrashShieldHandler.a(MessengerShareContentUtility.class, th);
                        str = null;
                    }
                }
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("webview_height_ratio", str).put("messenger_extensions", shareMessengerURLActionButton.e0).put("fallback_url", Utility.v(shareMessengerURLActionButton.Z));
            if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
                str2 = null;
            } else {
                try {
                    if (shareMessengerURLActionButton.f0) {
                        str2 = "hide";
                    } else {
                        str2 = null;
                    }
                } catch (Throwable th2) {
                    CrashShieldHandler.a(MessengerShareContentUtility.class, th2);
                }
            }
            return jSONObjectPut2.put("webview_share_button", str2);
        } catch (Throwable th3) {
            CrashShieldHandler.a(MessengerShareContentUtility.class, th3);
            return null;
        }
    }
}
