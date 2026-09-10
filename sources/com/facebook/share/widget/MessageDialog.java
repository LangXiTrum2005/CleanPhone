package com.facebook.share.widget;

import android.app.Activity;
import android.os.Bundle;
import androidx.media3.extractor.text.ttml.a;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.Sharer;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.MessageDialogFeature;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class MessageDialog extends FacebookDialogBase<ShareContent, Sharer.Result> implements Sharer {

    public class NativeHandler extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler {
        public NativeHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final boolean a(Object obj, boolean z2) {
            MessageDialogFeature messageDialogFeatureI;
            ShareContent shareContent = (ShareContent) obj;
            return (shareContent == null || (messageDialogFeatureI = MessageDialog.i(shareContent.getClass())) == null || !DialogPresenter.a(messageDialogFeatureI)) ? false : true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            String str;
            final ShareContent shareContent = (ShareContent) obj;
            ShareContentValidation.b(shareContent, ShareContentValidation.a());
            MessageDialog messageDialog = MessageDialog.this;
            final AppCall appCallC = messageDialog.c();
            Activity activityD = messageDialog.d();
            MessageDialogFeature messageDialogFeatureI = MessageDialog.i(shareContent.getClass());
            if (messageDialogFeatureI == MessageDialogFeature.MESSAGE_DIALOG) {
                str = "status";
            } else if (messageDialogFeatureI == MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE) {
                str = "GenericTemplate";
            } else if (messageDialogFeatureI == MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE) {
                str = "MediaTemplate";
            } else {
                str = messageDialogFeatureI == MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE ? "OpenGraphMusicTemplate" : "unknown";
            }
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(activityD);
            Bundle bundleD = a.d("fb_share_dialog_content_type", str);
            bundleD.putString("fb_share_dialog_content_uuid", appCallC.b().toString());
            bundleD.putString("fb_share_dialog_content_page_id", shareContent.e0);
            internalAppEventsLogger.d(bundleD, "fb_messenger_share_dialog_show");
            DialogPresenter.d(appCallC, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.MessageDialog.NativeHandler.1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public final Bundle a() {
                    return LegacyNativeDialogParameters.a(appCallC.b(), shareContent);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public final Bundle getParameters() {
                    return NativeDialogParameters.a(appCallC.b(), shareContent);
                }
            }, MessageDialog.i(shareContent.getClass()));
            return appCallC;
        }
    }

    static {
        CallbackManagerImpl.RequestCodeOffset.Message.d();
    }

    public static MessageDialogFeature i(Class cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSAGE_DIALOG;
        }
        if (ShareMessengerGenericTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE;
        }
        if (ShareMessengerOpenGraphMusicTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE;
        }
        if (ShareMessengerMediaTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE;
        }
        return null;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final AppCall c() {
        return new AppCall(this.d, 0);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NativeHandler());
        return arrayList;
    }
}
