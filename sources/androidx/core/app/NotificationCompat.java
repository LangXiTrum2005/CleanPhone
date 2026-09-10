package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import b0.b;
import b0.g;
import b0.h;
import b0.i;
import b0.m;
import b0.o;
import b0.o0;
import b0.q0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import go.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_VOICEMAIL = "voicemail";
    public static final String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BIG_TEXT = "android.bigText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON = "android.callPerson";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_TYPE = "android.callType";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COLORIZED = "android.colorized";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_INFO_TEXT = "android.infoText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGES = "android.messages";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE = "android.picture";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS = "android.progress";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_END_ICON = "android.progressEndIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_POINTS = "android.progressPoints";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_SEGMENTS = "android.progressSegments";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_START_ICON = "android.progressStartIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_TRACKER_ICON = "android.progressTrackerIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REQUEST_PROMOTED_ONGOING = "android.requestPromotedOngoing";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHORT_CRITICAL_TEXT = "android.shortCriticalText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SMALL_ICON = "android.icon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_STYLED_BY_PROGRESS = "android.styledByProgress";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUB_TEXT = "android.subText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEMPLATE = "android.template";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT = "android.text";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT_LINES = "android.textLines";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE = "android.title";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE_BIG = "android.title.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";

    @SuppressLint({"ActionValue"})
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    @Deprecated
    public NotificationCompat() {
    }

    public static g getAction(Notification notification, int i10) {
        return getActionCompatFromAction(notification.actions[i10]);
    }

    public static g getActionCompatFromAction(Notification.Action action) {
        q0[] q0VarArr;
        int i10;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        IconCompat iconCompatE = null;
        if (remoteInputs == null) {
            q0VarArr = null;
        } else {
            q0[] q0VarArr2 = new q0[remoteInputs.length];
            for (int i11 = 0; i11 < remoteInputs.length; i11++) {
                RemoteInput remoteInput = remoteInputs[i11];
                q0VarArr2[i11] = new q0(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), remoteInput.getEditChoicesBeforeSending(), remoteInput.getExtras(), null);
            }
            q0VarArr = q0VarArr2;
        }
        int i12 = Build.VERSION.SDK_INT;
        boolean z10 = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
        boolean z11 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int semanticAction = action.getSemanticAction();
        boolean zIsContextual = action.isContextual();
        boolean zA = i12 >= 31 ? h.a(action) : false;
        if (action.getIcon() == null && (i10 = action.icon) != 0) {
            return new g(i10, action.title, action.actionIntent, action.getExtras(), q0VarArr, z10, semanticAction, z11, zIsContextual, zA);
        }
        if (action.getIcon() != null) {
            Icon icon = action.getIcon();
            PorterDuff.Mode mode = IconCompat.f4014k;
            if (icon.getType() != 2 || icon.getResId() != 0) {
                iconCompatE = c.e(icon);
            }
        }
        return new g(iconCompatE, action.title, action.actionIntent, action.getExtras(), q0VarArr, z10, semanticAction, z11, zIsContextual, zA);
    }

    public static int getActionCount(Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
        return notification.getAllowSystemGeneratedContextualActions();
    }

    public static boolean getAutoCancel(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(Notification notification) {
        return notification.getBadgeIconType();
    }

    public static o getBubbleMetadata(Notification notification) {
        Notification.BubbleMetadata bubbleMetadata = notification.getBubbleMetadata();
        if (bubbleMetadata == null) {
            return null;
        }
        return m.a(bubbleMetadata);
    }

    public static String getCategory(Notification notification) {
        return notification.category;
    }

    public static String getChannelId(Notification notification) {
        return notification.getChannelId();
    }

    public static int getColor(Notification notification) {
        return notification.color;
    }

    public static CharSequence getContentInfo(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    public static CharSequence getContentText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    public static CharSequence getContentTitle(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @Deprecated
    public static Bundle getExtras(Notification notification) {
        return notification.extras;
    }

    public static String getGroup(Notification notification) {
        return notification.getGroup();
    }

    public static int getGroupAlertBehavior(Notification notification) {
        return notification.getGroupAlertBehavior();
    }

    public static boolean getHighPriority(Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static List<g> getInvisibleActions(Notification notification) {
        Bundle bundle;
        Bundle[] bundleArr;
        Bundle[] bundleArr2;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i10 = 0; i10 < bundle.size(); i10++) {
                Bundle bundle3 = bundle.getBundle(Integer.toString(i10));
                Bundle bundle4 = bundle3.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                boolean z10 = bundle4 != null ? bundle4.getBoolean("android.support.allowGeneratedReplies", false) : false;
                int i11 = bundle3.getInt("icon");
                CharSequence charSequence = bundle3.getCharSequence("title");
                PendingIntent pendingIntent = (PendingIntent) bundle3.getParcelable("actionIntent");
                Bundle bundle5 = bundle3.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                Parcelable[] parcelableArray = bundle3.getParcelableArray("remoteInputs");
                if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
                    bundleArr = (Bundle[]) parcelableArray;
                } else {
                    bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
                    bundle3.putParcelableArray("remoteInputs", bundleArr);
                }
                q0[] q0VarArrB = b.b(bundleArr);
                Parcelable[] parcelableArray2 = bundle3.getParcelableArray("dataOnlyRemoteInputs");
                if ((parcelableArray2 instanceof Bundle[]) || parcelableArray2 == null) {
                    bundleArr2 = (Bundle[]) parcelableArray2;
                } else {
                    bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArray2, parcelableArray2.length, Bundle[].class);
                    bundle3.putParcelableArray("dataOnlyRemoteInputs", bundleArr2);
                }
                b.b(bundleArr2);
                arrayList.add(new g(i11, charSequence, pendingIntent, bundle5, q0VarArrB, z10, bundle3.getInt("semanticAction"), bundle3.getBoolean("showsUserInterface"), false, false));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(Notification notification) {
        return (notification.flags & FLAG_LOCAL_ONLY) != 0;
    }

    public static c0.c getLocusId(Notification notification) {
        LocusId locusId = notification.getLocusId();
        if (locusId == null) {
            return null;
        }
        String id2 = locusId.getId();
        if (TextUtils.isEmpty(id2)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        return new c0.c(id2);
    }

    public static Notification[] getNotificationArrayFromBundle(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i10 = 0; i10 < parcelableArray.length; i10++) {
            notificationArr[i10] = (Notification) parcelableArray[i10];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean getOngoing(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(Notification notification) {
        return (notification.flags & 8) != 0;
    }

    public static List<o0> getPeople(Notification notification) {
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(o0.a((Person) it.next()));
            }
        }
        return arrayList;
    }

    public static Notification getPublicVersion(Notification notification) {
        return notification.publicVersion;
    }

    public static CharSequence getSettingsText(Notification notification) {
        return notification.getSettingsText();
    }

    public static String getShortCriticalText(Notification notification) {
        return notification.extras.getString(EXTRA_SHORT_CRITICAL_TEXT);
    }

    public static String getShortcutId(Notification notification) {
        return notification.getShortcutId();
    }

    public static boolean getShowWhen(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    public static String getSortKey(Notification notification) {
        return notification.getSortKey();
    }

    public static CharSequence getSubText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(Notification notification) {
        return notification.getTimeoutAfter();
    }

    public static boolean getUsesChronometer(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(Notification notification) {
        return notification.visibility;
    }

    public static boolean hasPromotableCharacteristics(Notification notification) {
        if (Build.VERSION.SDK_INT >= 36) {
            return i.a(notification);
        }
        return false;
    }

    public static boolean isGroupSummary(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static boolean isRequestPromotedOngoing(Notification notification) {
        return notification.extras.getBoolean(EXTRA_REQUEST_PROMOTED_ONGOING, false);
    }

    public static boolean isSilent(Notification notification) {
        if (GROUP_KEY_SILENT.equals(notification.getGroup())) {
            return true;
        }
        if (isGroupSummary(notification)) {
            return getGroupAlertBehavior(notification) == 2;
        }
        return getGroupAlertBehavior(notification) == 1;
    }

    public static Bitmap reduceLargeIconSize(Context context, Bitmap bitmap) {
        return bitmap;
    }
}
