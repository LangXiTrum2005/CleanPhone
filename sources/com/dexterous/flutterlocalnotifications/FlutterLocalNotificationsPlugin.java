package com.dexterous.flutterlocalnotifications;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import b0.a0;
import b0.b0;
import b0.g0;
import b0.k;
import b0.l;
import b0.l0;
import b0.o0;
import b0.q0;
import b0.u;
import be.d0;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import xi.m;
import xi.n;
import xi.o;
import xi.p;
import xi.r;
import xi.s;
import xi.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class FlutterLocalNotificationsPlugin implements n, s, t, r, ti.b, ui.a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ACTION_ID = "actionId";
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = "areNotificationsEnabled";
    private static final String CALLBACK_HANDLE = "callback_handle";
    private static final String CANCEL_ALL_METHOD = "cancelAll";
    private static final String CANCEL_ALL_PENDING_NOTIFICATIONS_METHOD = "cancelAllPendingNotifications";
    private static final String CANCEL_ID = "id";
    private static final String CANCEL_METHOD = "cancel";
    static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CANCEL_TAG = "tag";
    private static final String CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD = "canScheduleExactNotifications";
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = "createNotificationChannelGroup";
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = "createNotificationChannel";
    private static final String DEFAULT_ICON = "defaultIcon";
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = "deleteNotificationChannelGroup";
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = "deleteNotificationChannel";
    private static final String DISPATCHER_HANDLE = "dispatcher_handle";
    private static final String DRAWABLE = "drawable";
    private static final String EXACT_ALARMS_PERMISSION_ERROR_CODE = "exact_alarms_not_permitted";
    static final int EXACT_ALARM_PERMISSION_REQUEST_CODE = 2;
    static final int FULL_SCREEN_INTENT_PERMISSION_REQUEST_CODE = 3;
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = "Android version must be 6.0 or newer to use getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = "getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE = "getActiveNotificationMessagingStyleError";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = "getActiveNotificationMessagingStyle";
    private static final String GET_CALLBACK_HANDLE_METHOD = "getCallbackHandle";
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = "getNotificationAppLaunchDetails";
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = "getNotificationChannelsError";
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = "getNotificationChannels";
    private static final String HAS_NOTIFICATION_POLICY_ACCESS_METHOD = "hasNotificationPolicyAccess";
    private static final String INITIALIZE_METHOD = "initialize";
    private static final String INPUT = "input";
    private static final String INPUT_RESULT = "FlutterLocalNotificationsPluginInputResult";
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = "invalid_big_picture";
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.";
    private static final String INVALID_ICON_ERROR_CODE = "invalid_icon";
    private static final String INVALID_LARGE_ICON_ERROR_CODE = "invalid_large_icon";
    private static final String INVALID_LED_DETAILS_ERROR_CODE = "invalid_led_details";
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo";
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.";
    private static final String INVALID_SOUND_ERROR_CODE = "invalid_sound";
    private static final String METHOD_CHANNEL = "dexterous.com/flutter/local_notifications";
    static String NOTIFICATION_DETAILS = "notificationDetails";
    static final String NOTIFICATION_ID = "notificationId";
    private static final String NOTIFICATION_LAUNCHED_APP = "notificationLaunchedApp";
    static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 1;
    static final int NOTIFICATION_POLICY_ACCESS_REQUEST_CODE = 4;
    private static final String NOTIFICATION_RESPONSE_TYPE = "notificationResponseType";
    static final String NOTIFICATION_TAG = "notificationTag";
    static final String PAYLOAD = "payload";
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = "pendingNotificationRequests";
    private static final String PERIODICALLY_SHOW_METHOD = "periodicallyShow";
    private static final String PERIODICALLY_SHOW_WITH_DURATION_METHOD = "periodicallyShowWithDuration";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE = "permissionRequestInProgress";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE = "Another permission request is already in progress";
    private static final String REQUEST_EXACT_ALARMS_PERMISSION_METHOD = "requestExactAlarmsPermission";
    private static final String REQUEST_FULL_SCREEN_INTENT_PERMISSION_METHOD = "requestFullScreenIntentPermission";
    private static final String REQUEST_NOTIFICATIONS_PERMISSION_METHOD = "requestNotificationsPermission";
    private static final String REQUEST_NOTIFICATION_POLICY_ACCESS_METHOD = "requestNotificationPolicyAccess";
    private static final String SCHEDULED_NOTIFICATIONS = "scheduled_notifications";
    private static final String SELECT_FOREGROUND_NOTIFICATION_ACTION = "SELECT_FOREGROUND_NOTIFICATION";
    private static final String SELECT_NOTIFICATION = "SELECT_NOTIFICATION";
    private static final String SHARED_PREFERENCES_KEY = "notification_plugin_cache";
    private static final String SHOW_METHOD = "show";
    private static final String START_FOREGROUND_SERVICE = "startForegroundService";
    private static final String STOP_FOREGROUND_SERVICE = "stopForegroundService";
    private static final String TAG = "FLTLocalNotifPlugin";
    private static final String UNSUPPORTED_OS_VERSION_ERROR_CODE = "unsupported_os_version";
    private static final String ZONED_SCHEDULE_METHOD = "zonedSchedule";
    static com.google.gson.d gson;
    private Context applicationContext;
    private j callback;
    private p channel;
    private Activity mainActivity;
    private g permissionRequestProgress = g.f10551a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends fe.a<ArrayList<NotificationDetails>> {
    }

    private static void applyGrouping(NotificationDetails notificationDetails, b0.p pVar) {
        if (StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            return;
        }
        pVar.f5183s = notificationDetails.groupKey;
        if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
            pVar.f5184t = true;
        }
        pVar.E = notificationDetails.groupAlertBehavior.intValue();
    }

    private void areNotificationsEnabled(o oVar) {
        oVar.a(Boolean.valueOf(getNotificationManager(this.applicationContext).f5152b.areNotificationsEnabled()));
    }

    @NonNull
    public static com.google.gson.d buildGson() {
        if (gson == null) {
            RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype = RuntimeTypeAdapterFactory.of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class);
            ae.e eVar = ae.e.f3498c;
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            com.google.gson.a aVar = com.google.gson.d.f24742h;
            com.google.gson.n nVar = com.google.gson.d.f24743i;
            com.google.gson.o oVar = com.google.gson.d.f24744j;
            ArrayDeque arrayDeque = new ArrayDeque();
            ScheduleMode.a aVar2 = new ScheduleMode.a();
            fe.a aVar3 = new fe.a(ScheduleMode.class);
            arrayList.add(new d0(aVar2, aVar3, aVar3.f40810b == aVar3.f40809a));
            Objects.requireNonNull(runtimeTypeAdapterFactoryRegisterSubtype);
            arrayList.add(runtimeTypeAdapterFactoryRegisterSubtype);
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
            arrayList3.addAll(arrayList);
            Collections.reverse(arrayList3);
            ArrayList arrayList4 = new ArrayList(arrayList2);
            Collections.reverse(arrayList4);
            arrayList3.addAll(arrayList4);
            boolean z10 = ee.f.f40033a;
            gson = new com.google.gson.d(eVar, new HashMap(map), aVar, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, nVar, oVar, new ArrayList(arrayDeque));
        }
        return gson;
    }

    private static o0 buildPerson(Context context, PersonDetails personDetails) {
        IconSource iconSource;
        if (personDetails == null) {
            return null;
        }
        boolean value = BooleanUtils.getValue(personDetails.bot);
        Object obj = personDetails.icon;
        IconCompat iconFromSource = (obj == null || (iconSource = personDetails.iconBitmapSource) == null) ? null : getIconFromSource(context, obj, iconSource);
        boolean value2 = BooleanUtils.getValue(personDetails.important);
        String str = personDetails.key;
        if (str == null) {
            str = null;
        }
        String str2 = personDetails.name;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = personDetails.uri;
        String str4 = str3 != null ? str3 : null;
        o0 o0Var = new o0();
        o0Var.f5160a = str2;
        o0Var.f5161b = iconFromSource;
        o0Var.f5162c = str4;
        o0Var.f5163d = str;
        o0Var.f5164e = value;
        o0Var.f5165f = value2;
        return o0Var;
    }

    private static long calculateNextNotificationTrigger(long j10, long j11) {
        while (j10 < System.currentTimeMillis()) {
            j10 += j11;
        }
        return j10;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        Integer num = notificationDetails.repeatIntervalMilliseconds;
        if (num != null) {
            return num.intValue();
        }
        int i10 = e.f10547a[notificationDetails.repeatInterval.ordinal()];
        if (i10 == 1) {
            return ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        if (i10 == 2) {
            return 3600000L;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0L : 604800000L;
        }
        return 86400000L;
    }

    private static Boolean canCreateNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        NotificationChannelAction notificationChannelAction;
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(notificationChannelDetails.f10561id);
        return Boolean.valueOf((notificationChannel == null && ((notificationChannelAction = notificationChannelDetails.channelAction) == null || notificationChannelAction == NotificationChannelAction.CreateIfNotExists)) || (notificationChannel != null && notificationChannelDetails.channelAction == NotificationChannelAction.Update));
    }

    private void cancel(m mVar, o oVar) {
        Map map = (Map) mVar.f53823b;
        cancelNotification((Integer) map.get("id"), (String) map.get("tag"));
        oVar.a(null);
    }

    private void cancelAllNotifications(o oVar) {
        getNotificationManager(this.applicationContext).f5152b.cancelAll();
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (arrayListLoadScheduledNotifications == null || arrayListLoadScheduledNotifications.isEmpty()) {
            oVar.a(null);
            return;
        }
        Intent intent = new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (it.hasNext()) {
            getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().f10563id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        oVar.a(null);
    }

    private void cancelAllPendingNotifications(o oVar) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (arrayListLoadScheduledNotifications == null || arrayListLoadScheduledNotifications.isEmpty()) {
            oVar.a(null);
            return;
        }
        AlarmManager alarmManager = getAlarmManager(this.applicationContext);
        Intent intent = new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (it.hasNext()) {
            alarmManager.cancel(getBroadcastPendingIntent(this.applicationContext, it.next().f10563id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        oVar.a(null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class)));
        l0 notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.a(num.intValue(), null);
        } else {
            notificationManager.a(num.intValue(), str);
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (!(obj instanceof ArrayList)) {
            return (byte[]) obj;
        }
        ArrayList arrayList = (ArrayList) obj;
        byte[] bArr = new byte[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            bArr[i10] = (byte) ((Double) arrayList.get(i10)).intValue();
        }
        return bArr;
    }

    private static void checkCanScheduleExactAlarms(AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31 && !alarmManager.canScheduleExactAlarms()) {
            throw new f();
        }
    }

    private static a0 createMessage(Context context, MessageDetails messageDetails) {
        String str;
        a0 a0Var = new a0(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (str2 != null && (str = messageDetails.dataMimeType) != null) {
            Uri uri = Uri.parse(str2);
            a0Var.f5078e = str;
            a0Var.f5079f = uri;
        }
        return a0Var;
    }

    public static Notification createNotification(Context context, NotificationDetails notificationDetails) {
        Intent intent;
        int i10;
        PendingIntent broadcast;
        IconSource iconSource;
        NotificationChannelDetails notificationChannelDetailsFromNotificationDetails = NotificationChannelDetails.fromNotificationDetails(notificationDetails);
        if (canCreateNotificationChannel(context, notificationChannelDetailsFromNotificationDetails).booleanValue()) {
            setupNotificationChannel(context, notificationChannelDetailsFromNotificationDetails);
        }
        Intent launchIntent = getLaunchIntent(context);
        launchIntent.setAction(SELECT_NOTIFICATION);
        launchIntent.putExtra(NOTIFICATION_ID, notificationDetails.f10563id);
        launchIntent.putExtra(PAYLOAD, notificationDetails.payload);
        PendingIntent activity = PendingIntent.getActivity(context, notificationDetails.f10563id.intValue(), launchIntent, 201326592);
        DefaultStyleInformation defaultStyleInformation = (DefaultStyleInformation) notificationDetails.styleInformation;
        b0.p pVar = new b0.p(context, notificationDetails.channelId);
        pVar.f5170e = b0.p.b(defaultStyleInformation.htmlFormatTitle.booleanValue() ? fromHtml(notificationDetails.title) : notificationDetails.title);
        pVar.f5171f = b0.p.b(defaultStyleInformation.htmlFormatBody.booleanValue() ? fromHtml(notificationDetails.body) : notificationDetails.body);
        pVar.G.tickerText = b0.p.b(notificationDetails.ticker);
        pVar.c(16, BooleanUtils.getValue(notificationDetails.autoCancel));
        pVar.f5172g = activity;
        pVar.f5176k = notificationDetails.priority.intValue();
        pVar.c(2, BooleanUtils.getValue(notificationDetails.ongoing));
        pVar.H = BooleanUtils.getValue(notificationDetails.silent);
        pVar.c(8, BooleanUtils.getValue(notificationDetails.onlyAlertOnce));
        int i11 = 0;
        if (notificationDetails.actions != null) {
            int iIntValue = notificationDetails.f10563id.intValue() * 16;
            for (NotificationAction notificationAction : notificationDetails.actions) {
                IconCompat iconFromSource = (TextUtils.isEmpty(notificationAction.icon) || (iconSource = notificationAction.iconSource) == null) ? null : getIconFromSource(context, notificationAction.icon, iconSource);
                Boolean bool = notificationAction.showsUserInterface;
                if (bool == null || !bool.booleanValue()) {
                    intent = new Intent(context, (Class<?>) ActionBroadcastReceiver.class);
                    intent.setAction("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED");
                } else {
                    intent = getLaunchIntent(context);
                    intent.setAction(SELECT_FOREGROUND_NOTIFICATION_ACTION);
                }
                intent.putExtra(NOTIFICATION_ID, notificationDetails.f10563id).putExtra(NOTIFICATION_TAG, notificationDetails.tag).putExtra(ACTION_ID, notificationAction.f10560id).putExtra(CANCEL_NOTIFICATION, notificationAction.cancelNotification).putExtra(PAYLOAD, notificationDetails.payload);
                List<g7.a> list = notificationAction.actionInputs;
                int i12 = (list == null || list.isEmpty()) ? 201326592 : Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
                Boolean bool2 = notificationAction.showsUserInterface;
                if (bool2 == null || !bool2.booleanValue()) {
                    i10 = iIntValue + 1;
                    broadcast = PendingIntent.getBroadcast(context, iIntValue, intent, i12);
                } else {
                    i10 = iIntValue + 1;
                    broadcast = PendingIntent.getActivity(context, iIntValue, intent, i12);
                }
                SpannableString spannableString = new SpannableString(notificationAction.title);
                if (notificationAction.titleColor != null) {
                    spannableString.setSpan(new ForegroundColorSpan(notificationAction.titleColor.intValue()), i11, spannableString.length(), i11);
                }
                b0.f fVar = new b0.f(iconFromSource, spannableString, broadcast);
                Boolean bool3 = notificationAction.contextual;
                if (bool3 != null) {
                    fVar.f5102i = bool3.booleanValue();
                }
                Boolean bool4 = notificationAction.showsUserInterface;
                if (bool4 != null) {
                    fVar.f5101h = bool4.booleanValue();
                }
                Boolean bool5 = notificationAction.allowGeneratedReplies;
                if (bool5 != null) {
                    fVar.f5097d = bool5.booleanValue();
                }
                Integer num = notificationAction.semanticAction;
                if (num != null) {
                    fVar.f5100g = num.intValue();
                }
                List<g7.a> list2 = notificationAction.actionInputs;
                if (list2 != null) {
                    for (g7.a aVar : list2) {
                        HashSet hashSet = new HashSet();
                        Bundle bundle = new Bundle();
                        String str = aVar.f41719c;
                        Boolean bool6 = aVar.f41718b;
                        boolean zBooleanValue = bool6 != null ? bool6.booleanValue() : true;
                        List list3 = aVar.f41720d;
                        if (list3 != null) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                hashSet.add((String) it.next());
                            }
                        }
                        List list4 = aVar.f41717a;
                        i11 = 0;
                        q0 q0Var = new q0(INPUT_RESULT, str, list4 != null ? (CharSequence[]) list4.toArray(new CharSequence[0]) : null, zBooleanValue, 0, bundle, hashSet);
                        if (fVar.f5099f == null) {
                            fVar.f5099f = new ArrayList();
                        }
                        fVar.f5099f.add(q0Var);
                    }
                }
                if (BooleanUtils.getValue(notificationAction.invisible)) {
                    pVar.f5169d.add(fVar.a());
                } else {
                    pVar.f5167b.add(fVar.a());
                }
                iIntValue = i10;
            }
        }
        setSmallIcon(context, notificationDetails, pVar);
        Bitmap bitmapFromSource = getBitmapFromSource(context, notificationDetails.largeIcon, notificationDetails.largeIconBitmapSource);
        pVar.f5174i = bitmapFromSource == null ? null : IconCompat.b(NotificationCompat.reduceLargeIconSize(pVar.f5166a, bitmapFromSource));
        Integer num2 = notificationDetails.color;
        if (num2 != null) {
            pVar.f5190z = num2.intValue();
        }
        Boolean bool7 = notificationDetails.colorized;
        if (bool7 != null) {
            pVar.f5186v = bool7.booleanValue();
            pVar.f5187w = true;
        }
        Boolean bool8 = notificationDetails.showWhen;
        if (bool8 != null) {
            pVar.l = BooleanUtils.getValue(bool8);
        }
        Long l = notificationDetails.when;
        if (l != null) {
            pVar.G.when = l.longValue();
        }
        Boolean bool9 = notificationDetails.usesChronometer;
        if (bool9 != null) {
            pVar.f5177m = bool9.booleanValue();
        }
        Boolean bool10 = notificationDetails.chronometerCountDown;
        if (bool10 != null) {
            boolean zBooleanValue2 = bool10.booleanValue();
            if (pVar.f5189y == null) {
                pVar.f5189y = new Bundle();
            }
            pVar.f5189y.putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, zBooleanValue2);
        }
        if (BooleanUtils.getValue(notificationDetails.fullScreenIntent)) {
            pVar.f5173h = activity;
            pVar.c(128, true);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.shortcutId).booleanValue()) {
            pVar.C = notificationDetails.shortcutId;
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.subText).booleanValue()) {
            pVar.f5179o = b0.p.b(notificationDetails.subText);
        }
        Integer num3 = notificationDetails.number;
        if (num3 != null) {
            pVar.f5175j = num3.intValue();
        }
        setVisibility(notificationDetails, pVar);
        applyGrouping(notificationDetails, pVar);
        setSound(context, notificationDetails, pVar);
        setVibrationPattern(notificationDetails, pVar);
        setLights(notificationDetails, pVar);
        setStyle(context, notificationDetails, pVar);
        setProgress(notificationDetails, pVar);
        setCategory(notificationDetails, pVar);
        setTimeoutAfter(notificationDetails, pVar);
        Notification notificationA = pVar.a();
        int[] iArr = notificationDetails.additionalFlags;
        if (iArr != null && iArr.length > 0) {
            int length = iArr.length;
            while (i11 < length) {
                notificationA.flags = iArr[i11] | notificationA.flags;
                i11++;
            }
        }
        return notificationA;
    }

    private void createNotificationChannel(m mVar, o oVar) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) mVar.f53823b));
        oVar.a(null);
    }

    private void createNotificationChannelGroup(m mVar, o oVar) {
        NotificationChannelGroupDetails notificationChannelGroupDetailsFrom = NotificationChannelGroupDetails.from((Map) mVar.f53823b);
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(notificationChannelGroupDetailsFrom.f10562id, notificationChannelGroupDetailsFrom.name);
        notificationChannelGroup.setDescription(notificationChannelGroupDetailsFrom.description);
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        oVar.a(null);
    }

    private void deleteNotificationChannel(m mVar, o oVar) {
        ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannel((String) mVar.f53823b);
        oVar.a(null);
    }

    private void deleteNotificationChannelGroup(m mVar, o oVar) {
        ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannelGroup((String) mVar.f53823b);
        oVar.a(null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) {
        String resourceEntryName;
        IconSource iconSource;
        if (iconCompat == null) {
            return null;
        }
        int type = iconCompat.f4015a;
        if (type == -1) {
            type = ((Icon) iconCompat.f4016b).getType();
        }
        if (type == 2) {
            IconSource iconSource2 = IconSource.DrawableResource;
            resourceEntryName = this.applicationContext.getResources().getResourceEntryName(iconCompat.e());
            iconSource = iconSource2;
        } else {
            if (type != 4) {
                return null;
            }
            iconSource = IconSource.ContentUri;
            resourceEntryName = iconCompat.f().toString();
        }
        HashMap map = new HashMap();
        map.put("source", Integer.valueOf(iconSource.ordinal()));
        map.put("data", resourceEntryName);
        return map;
    }

    private Map<String, Object> describePerson(o0 o0Var) {
        if (o0Var == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(X3.i.W, o0Var.f5163d);
        map.put("name", o0Var.f5160a);
        map.put("uri", o0Var.f5162c);
        map.put("bot", Boolean.valueOf(o0Var.f5164e));
        map.put("important", Boolean.valueOf(o0Var.f5165f));
        map.put("icon", describeIcon(o0Var.f5161b));
        return map;
    }

    private NotificationDetails extractNotificationDetails(o oVar, Map<String, Object> map) {
        NotificationDetails notificationDetailsFrom = NotificationDetails.from(map);
        if (hasInvalidIcon(oVar, notificationDetailsFrom.icon) || hasInvalidLargeIcon(oVar, notificationDetailsFrom.largeIcon, notificationDetailsFrom.largeIconBitmapSource) || hasInvalidBigPictureResources(oVar, notificationDetailsFrom) || hasInvalidRawSoundResource(oVar, notificationDetailsFrom) || hasInvalidLedDetails(oVar, notificationDetailsFrom)) {
            return null;
        }
        return notificationDetailsFrom;
    }

    public static Map<String, Object> extractNotificationResponseMap(Intent intent) {
        int intExtra = intent.getIntExtra(NOTIFICATION_ID, 0);
        HashMap map = new HashMap();
        map.put(NOTIFICATION_ID, Integer.valueOf(intExtra));
        map.put(NOTIFICATION_TAG, intent.getStringExtra(NOTIFICATION_TAG));
        map.put(ACTION_ID, intent.getStringExtra(ACTION_ID));
        map.put(PAYLOAD, intent.getStringExtra(PAYLOAD));
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null) {
            map.put(INPUT, resultsFromIntent.getString(INPUT_RESULT));
        }
        if (SELECT_NOTIFICATION.equals(intent.getAction())) {
            map.put(NOTIFICATION_RESPONSE_TYPE, 0);
        }
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            map.put(NOTIFICATION_RESPONSE_TYPE, 1);
        }
        return map;
    }

    private static Spanned fromHtml(String str) {
        if (str == null) {
            return null;
        }
        return Html.fromHtml(str, 0);
    }

    private void getActiveNotificationMessagingStyle(m mVar, o oVar) {
        int i10;
        Notification notification;
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        try {
            Map map = (Map) mVar.f53823b;
            int iIntValue = ((Integer) map.get("id")).intValue();
            String str = (String) map.get("tag");
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            int length = activeNotifications.length;
            while (true) {
                if (i10 >= length) {
                    notification = null;
                    break;
                }
                StatusBarNotification statusBarNotification = activeNotifications[i10];
                i10 = (statusBarNotification.getId() == iIntValue && (str == null || str.equals(statusBarNotification.getTag()))) ? 0 : i10 + 1;
                notification = statusBarNotification.getNotification();
                break;
            }
            if (notification == null) {
                oVar.a(null);
                return;
            }
            g0 g0VarC = g0.c(notification);
            b0 b0Var = g0VarC instanceof b0 ? (b0) g0VarC : null;
            if (b0Var == null) {
                oVar.a(null);
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("groupConversation", Boolean.valueOf(b0Var.f()));
            map2.put("person", describePerson(b0Var.f5083g));
            map2.put("conversationTitle", b0Var.f5084h);
            ArrayList arrayList = new ArrayList();
            for (a0 a0Var : b0Var.f5081e) {
                HashMap map3 = new HashMap();
                map3.put("text", a0Var.f5074a);
                map3.put("timestamp", Long.valueOf(a0Var.f5075b));
                map3.put("person", describePerson(a0Var.f5076c));
                Uri uri = a0Var.f5079f;
                if (uri != null) {
                    map3.put("dataUri", uri.toString());
                }
                String str2 = a0Var.f5078e;
                if (str2 != null) {
                    map3.put("dataMimeType", str2);
                }
                arrayList.add(map3);
            }
            map2.put("messages", arrayList);
            oVar.a(map2);
        } catch (Throwable th2) {
            oVar.b(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE, th2.getMessage(), Log.getStackTraceString(th2));
        }
    }

    private void getActiveNotifications(o oVar) {
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService("notification")).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap map = new HashMap();
                map.put("id", Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                map.put("channelId", notification.getChannelId());
                map.put("tag", statusBarNotification.getTag());
                map.put("groupKey", notification.getGroup());
                map.put("title", notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE));
                map.put("body", notification.extras.getCharSequence(NotificationCompat.EXTRA_TEXT));
                map.put("bigText", notification.extras.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT));
                arrayList.add(map);
            }
            oVar.a(arrayList);
        } catch (Throwable th2) {
            oVar.b(UNSUPPORTED_OS_VERSION_ERROR_CODE, th2.getMessage(), Log.getStackTraceString(th2));
        }
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return null;
        }
        byte[] bArrCastObjectToByteArray = castObjectToByteArray(obj);
        return BitmapFactory.decodeByteArray(bArrCastObjectToByteArray, 0, bArrCastObjectToByteArray.length);
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i10, Intent intent) {
        return PendingIntent.getBroadcast(context, i10, intent, 201326592);
    }

    private void getCallbackHandle(o oVar) {
        oVar.a(Long.valueOf(this.applicationContext.getSharedPreferences("flutter_local_notifications_plugin", 0).getLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", -1L)));
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) {
        int i10 = e.f10548b[iconSource.ordinal()];
        if (i10 == 1) {
            return IconCompat.c(context, getDrawableResourceId(context, (String) obj));
        }
        if (i10 == 2) {
            return IconCompat.b(BitmapFactory.decodeFile((String) obj));
        }
        if (i10 == 3) {
            String str = (String) obj;
            PorterDuff.Mode mode = IconCompat.f4014k;
            str.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f4016b = str;
            return iconCompat;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return null;
            }
            byte[] bArrCastObjectToByteArray = castObjectToByteArray(obj);
            int length = bArrCastObjectToByteArray.length;
            IconCompat iconCompat2 = new IconCompat(3);
            iconCompat2.f4016b = bArrCastObjectToByteArray;
            iconCompat2.f4019e = 0;
            iconCompat2.f4020f = length;
            return iconCompat2;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(((ri.d) v9.e.F().f52503b).b((String) obj));
            FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenFd.createInputStream();
            IconCompat iconCompatB = IconCompat.b(BitmapFactory.decodeStream(fileInputStreamCreateInputStream));
            fileInputStreamCreateInputStream.close();
            assetFileDescriptorOpenFd.close();
            return iconCompatB;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", notificationChannel.getId());
        map.put("name", notificationChannel.getName());
        map.put("description", notificationChannel.getDescription());
        map.put("groupId", notificationChannel.getGroup());
        map.put("showBadge", Boolean.valueOf(notificationChannel.canShowBadge()));
        map.put("importance", Integer.valueOf(notificationChannel.getImportance()));
        Uri sound = notificationChannel.getSound();
        if (sound == null) {
            map.put("sound", null);
            map.put("playSound", Boolean.FALSE);
        } else {
            map.put("playSound", Boolean.TRUE);
            List listAsList = Arrays.asList(SoundSource.values());
            if (sound.getScheme().equals("android.resource")) {
                String[] strArrSplit = sound.toString().split("/");
                String str = strArrSplit[strArrSplit.length - 1];
                Integer numTryParseInt = tryParseInt(str);
                if (numTryParseInt == null) {
                    map.put("soundSource", Integer.valueOf(listAsList.indexOf(SoundSource.RawResource)));
                    map.put("sound", str);
                } else {
                    try {
                        String resourceEntryName = this.applicationContext.getResources().getResourceEntryName(numTryParseInt.intValue());
                        if (resourceEntryName != null) {
                            map.put("soundSource", Integer.valueOf(listAsList.indexOf(SoundSource.RawResource)));
                            map.put("sound", resourceEntryName);
                        }
                    } catch (Exception unused) {
                        map.put("sound", null);
                        map.put("playSound", Boolean.FALSE);
                    }
                }
            } else {
                map.put("soundSource", Integer.valueOf(listAsList.indexOf(SoundSource.Uri)));
                map.put("sound", sound.toString());
            }
        }
        map.put("bypassDnd", Boolean.valueOf(notificationChannel.canBypassDnd()));
        map.put("enableVibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
        map.put("vibrationPattern", notificationChannel.getVibrationPattern());
        map.put("enableLights", Boolean.valueOf(notificationChannel.shouldShowLights()));
        map.put("ledColor", Integer.valueOf(notificationChannel.getLightColor()));
        AudioAttributes audioAttributes = notificationChannel.getAudioAttributes();
        map.put("audioAttributesUsage", Integer.valueOf(audioAttributes == null ? 5 : audioAttributes.getUsage()));
        return map;
    }

    private static String getNextFireDate(NotificationDetails notificationDetails) {
        ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
        if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1L));
        }
        if (scheduledNotificationRepeatFrequency != ScheduledNotificationRepeatFrequency.Weekly) {
            return null;
        }
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1L));
    }

    private static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        ZoneId zoneIdOf = ZoneId.of(notificationDetails.timeZoneName);
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), zoneIdOf);
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(zoneIdOf);
        ZonedDateTime zonedDateTimeOf2 = ZonedDateTime.of(zonedDateTimeNow.getYear(), zonedDateTimeNow.getMonthValue(), zonedDateTimeNow.getDayOfMonth(), zonedDateTimeOf.getHour(), zonedDateTimeOf.getMinute(), zonedDateTimeOf.getSecond(), zonedDateTimeOf.getNano(), zoneIdOf);
        while (zonedDateTimeOf2.isBefore(zonedDateTimeNow)) {
            zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
        }
        DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
        if (dateTimeComponents == DateTimeComponents.Time) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
            while (zonedDateTimeOf2.getDayOfWeek() != zonedDateTimeOf.getDayOfWeek()) {
                zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
            while (zonedDateTimeOf2.getDayOfMonth() != zonedDateTimeOf.getDayOfMonth()) {
                zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
        }
        if (dateTimeComponents != DateTimeComponents.DateAndTime) {
            return null;
        }
        while (true) {
            if (zonedDateTimeOf2.getMonthValue() == zonedDateTimeOf.getMonthValue() && zonedDateTimeOf2.getDayOfMonth() == zonedDateTimeOf.getDayOfMonth()) {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
            }
            zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
        }
    }

    private void getNotificationAppLaunchDetails(o oVar) {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        Activity activity = this.mainActivity;
        if (activity != null) {
            Intent intent = activity.getIntent();
            boolean z10 = intent != null && (SELECT_NOTIFICATION.equals(intent.getAction()) || SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) && !launchedActivityFromHistory(intent);
            Boolean boolValueOf = Boolean.valueOf(z10);
            if (z10) {
                map.put("notificationResponse", extractNotificationResponseMap(intent));
            }
            bool = boolValueOf;
        }
        map.put(NOTIFICATION_LAUNCHED_APP, bool);
        oVar.a(map);
    }

    private void getNotificationChannels(o oVar) {
        try {
            List<NotificationChannel> notificationChannels = getNotificationManager(this.applicationContext).f5152b.getNotificationChannels();
            ArrayList arrayList = new ArrayList();
            Iterator<NotificationChannel> it = notificationChannels.iterator();
            while (it.hasNext()) {
                arrayList.add(getMappedNotificationChannel(it.next()));
            }
            oVar.a(arrayList);
        } catch (Throwable th2) {
            oVar.b(GET_NOTIFICATION_CHANNELS_ERROR_CODE, th2.getMessage(), Log.getStackTraceString(th2));
        }
    }

    private static l0 getNotificationManager(Context context) {
        return new l0(context);
    }

    private boolean hasInvalidBigPictureResources(o oVar, NotificationDetails notificationDetails) {
        if (notificationDetails.style == NotificationStyle.BigPicture) {
            BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
            if (hasInvalidLargeIcon(oVar, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
                return true;
            }
            BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
            if (bitmapSource == BitmapSource.DrawableResource) {
                String str = (String) bigPictureStyleInformation.bigPicture;
                return StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, oVar, INVALID_BIG_PICTURE_ERROR_CODE);
            }
            if (bitmapSource == BitmapSource.FilePath) {
                return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
            }
            if (bitmapSource == BitmapSource.ByteArray) {
                byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
                return bArr == null || bArr.length == 0;
            }
        }
        return false;
    }

    private boolean hasInvalidIcon(o oVar, String str) {
        return (StringUtils.isNullOrEmpty(str).booleanValue() || isValidDrawableResource(this.applicationContext, str, oVar, INVALID_ICON_ERROR_CODE)) ? false : true;
    }

    private boolean hasInvalidLargeIcon(o oVar, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource != bitmapSource2 && bitmapSource != BitmapSource.FilePath) {
            return bitmapSource == BitmapSource.ByteArray && ((byte[]) obj).length == 0;
        }
        String str = (String) obj;
        return (StringUtils.isNullOrEmpty(str).booleanValue() || bitmapSource != bitmapSource2 || isValidDrawableResource(this.applicationContext, str, oVar, INVALID_LARGE_ICON_ERROR_CODE)) ? false : true;
    }

    private boolean hasInvalidLedDetails(o oVar, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor == null) {
            return false;
        }
        if (notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            return false;
        }
        oVar.b(INVALID_LED_DETAILS_ERROR_CODE, INVALID_LED_DETAILS_ERROR_MESSAGE, null);
        return true;
    }

    private boolean hasInvalidRawSoundResource(o oVar, NotificationDetails notificationDetails) {
        if (StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue()) {
            return false;
        }
        SoundSource soundSource = notificationDetails.soundSource;
        if ((soundSource != null && soundSource != SoundSource.RawResource) || this.applicationContext.getResources().getIdentifier(notificationDetails.sound, "raw", this.applicationContext.getPackageName()) != 0) {
            return false;
        }
        oVar.b(INVALID_SOUND_ERROR_CODE, defpackage.e.o("The resource ", notificationDetails.sound, " could not be found. Please make sure it has been added as a raw resource to your Android head project."), null);
        return true;
    }

    private void initialize(m mVar, o oVar) {
        String str = (String) ((Map) mVar.f53823b).get(DEFAULT_ICON);
        if (isValidDrawableResource(this.applicationContext, str, oVar, INVALID_ICON_ERROR_CODE)) {
            Long lC = com.google.android.gms.internal.auth.i.C(mVar.a(DISPATCHER_HANDLE));
            Long lC2 = com.google.android.gms.internal.auth.i.C(mVar.a(CALLBACK_HANDLE));
            if (lC != null && lC2 != null) {
                Context context = this.applicationContext;
                context.getSharedPreferences("flutter_local_notifications_plugin", 0).edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", lC.longValue()).apply();
                context.getSharedPreferences("flutter_local_notifications_plugin", 0).edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", lC2.longValue()).apply();
            }
            this.applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).edit().putString(DEFAULT_ICON, str).apply();
            oVar.a(Boolean.TRUE);
        }
    }

    private static boolean isValidDrawableResource(Context context, String str, o oVar, String str2) {
        if (context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName()) != 0) {
            return true;
        }
        oVar.b(str2, defpackage.e.o("The resource ", str, " could not be found. Please make sure it has been added as a drawable resource to your Android head project."), null);
        return false;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        return intent != null && (intent.getFlags() & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).getString(SCHEDULED_NOTIFICATIONS, null);
        return string != null ? (ArrayList) buildGson().b(string, new a().f40810b) : arrayList;
    }

    private void pendingNotificationRequests(o oVar) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        for (NotificationDetails notificationDetails : arrayListLoadScheduledNotifications) {
            HashMap map = new HashMap();
            map.put("id", notificationDetails.f10563id);
            map.put("title", notificationDetails.title);
            map.put("body", notificationDetails.body);
            map.put(PAYLOAD, notificationDetails.payload);
            arrayList.add(map);
        }
        oVar.a(arrayList);
    }

    private void processForegroundNotificationAction(Intent intent, Map<String, Object> map) {
        if (intent.getBooleanExtra(CANCEL_NOTIFICATION, false)) {
            new l0(this.applicationContext).a(((Integer) map.get(NOTIFICATION_ID)).intValue(), null);
        }
    }

    public static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (it.hasNext()) {
            if (it.next().f10563id.equals(num)) {
                it.remove();
                break;
            }
        }
        saveScheduledNotifications(context, arrayListLoadScheduledNotifications);
    }

    private void repeat(m mVar, o oVar) {
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(oVar, (Map) mVar.f53823b);
        if (notificationDetailsExtractNotificationDetails != null) {
            try {
                repeatNotification(this.applicationContext, notificationDetailsExtractNotificationDetails, Boolean.TRUE);
                oVar.a(null);
            } catch (f e10) {
                oVar.b(e10.f10550a, e10.getMessage(), null);
            }
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long jCalculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long jLongValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, notificationDetails.repeatTime.hour.intValue());
            calendar.set(12, notificationDetails.repeatTime.minute.intValue());
            calendar.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                calendar.set(7, num.intValue());
            }
            jLongValue = calendar.getTimeInMillis();
        }
        long jCalculateNextNotificationTrigger = calculateNextNotificationTrigger(jLongValue, jCalculateRepeatIntervalMilliseconds);
        String strF = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strF);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.f10563id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.inexact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, jCalculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, jCalculateNextNotificationTrigger, jCalculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public static void rescheduleNotifications(Context context) {
        for (NotificationDetails notificationDetails : loadScheduledNotifications(context)) {
            try {
                if (notificationDetails.repeatInterval != null || notificationDetails.repeatIntervalMilliseconds != null) {
                    repeatNotification(context, notificationDetails, Boolean.FALSE);
                } else if (notificationDetails.timeZoneName != null) {
                    zonedScheduleNotification(context, notificationDetails, Boolean.FALSE);
                } else {
                    scheduleNotification(context, notificationDetails, Boolean.FALSE);
                }
            } catch (f e10) {
                Log.e(TAG, e10.getMessage());
                removeNotificationFromCache(context, notificationDetails.f10563id);
            }
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource != null && soundSource != SoundSource.RawResource) {
            if (soundSource == SoundSource.Uri) {
                return Uri.parse(str);
            }
            return null;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        for (NotificationDetails notificationDetails2 : arrayListLoadScheduledNotifications) {
            if (!notificationDetails2.f10563id.equals(notificationDetails.f10563id)) {
                arrayList.add(notificationDetails2);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).edit().putString(SCHEDULED_NOTIFICATIONS, buildGson().f(arrayList)).apply();
    }

    public static void scheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        try {
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                zonedScheduleNextNotification(context, notificationDetails);
                return;
            }
            if (notificationDetails.matchDateTimeComponents != null) {
                zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
                return;
            }
            if (notificationDetails.repeatInterval == null && notificationDetails.repeatIntervalMilliseconds == null) {
                removeNotificationFromCache(context, notificationDetails.f10563id);
                return;
            }
            scheduleNextRepeatingNotification(context, notificationDetails);
        } catch (f e10) {
            Log.e(TAG, e10.getMessage());
            removeNotificationFromCache(context, notificationDetails.f10563id);
        }
    }

    private static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long jCalculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String strF = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strF);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.f10563id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exactAllowWhileIdle;
        }
        setupAllowWhileIdleAlarm(notificationDetails, alarmManager, jCalculateNextNotificationTrigger, broadcastPendingIntent);
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String strF = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strF);
        setupAlarm(notificationDetails, getAlarmManager(context), notificationDetails.millisecondsSinceEpoch.longValue(), getBroadcastPendingIntent(context, notificationDetails.f10563id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        if (!SELECT_NOTIFICATION.equals(intent.getAction()) && !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        Map<String, Object> mapExtractNotificationResponseMap = extractNotificationResponseMap(intent);
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, mapExtractNotificationResponseMap);
        }
        this.channel.a("didReceiveNotificationResponse", mapExtractNotificationResponseMap, null);
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
    }

    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, b0.p pVar) {
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        k kVar = new k();
        if (bigPictureStyleInformation.contentTitle != null) {
            kVar.f5122b = b0.p.b(bigPictureStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigPictureStyleInformation.contentTitle) : bigPictureStyleInformation.contentTitle);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            kVar.f5123c = b0.p.b(bigPictureStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigPictureStyleInformation.summaryText) : bigPictureStyleInformation.summaryText);
            kVar.f5124d = true;
        }
        if (bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            kVar.g(null);
        } else {
            Object obj = bigPictureStyleInformation.largeIcon;
            if (obj != null) {
                kVar.g(getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource));
            }
        }
        Bitmap bitmapFromSource = getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource);
        kVar.f5136e = bitmapFromSource != null ? IconCompat.b(bitmapFromSource) : null;
        pVar.e(kVar);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, b0.p pVar) {
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        l lVar = new l(0);
        if (bigTextStyleInformation.bigText != null) {
            lVar.f5145f = b0.p.b(bigTextStyleInformation.htmlFormatBigText.booleanValue() ? fromHtml(bigTextStyleInformation.bigText) : bigTextStyleInformation.bigText);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            lVar.f5122b = b0.p.b(bigTextStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigTextStyleInformation.contentTitle) : bigTextStyleInformation.contentTitle);
        }
        if (bigTextStyleInformation.summaryText != null) {
            lVar.f5123c = b0.p.b(bigTextStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigTextStyleInformation.summaryText) : bigTextStyleInformation.summaryText);
            lVar.f5124d = true;
        }
        pVar.e(lVar);
    }

    private void setCanScheduleExactNotifications(o oVar) {
        if (Build.VERSION.SDK_INT < 31) {
            oVar.a(Boolean.TRUE);
        } else {
            oVar.a(Boolean.valueOf(getAlarmManager(this.applicationContext).canScheduleExactAlarms()));
        }
    }

    private static void setCategory(NotificationDetails notificationDetails, b0.p pVar) {
        String str = notificationDetails.category;
        if (str == null) {
            return;
        }
        pVar.f5188x = str;
    }

    private static void setInboxStyle(NotificationDetails notificationDetails, b0.p pVar) {
        CharSequence charSequenceFromHtml;
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        l lVar = new l(1);
        if (inboxStyleInformation.contentTitle != null) {
            lVar.f5122b = b0.p.b(inboxStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(inboxStyleInformation.contentTitle) : inboxStyleInformation.contentTitle);
        }
        if (inboxStyleInformation.summaryText != null) {
            lVar.f5123c = b0.p.b(inboxStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(inboxStyleInformation.summaryText) : inboxStyleInformation.summaryText);
            lVar.f5124d = true;
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            for (String str : arrayList) {
                if (inboxStyleInformation.htmlFormatLines.booleanValue()) {
                    charSequenceFromHtml = str;
                    charSequenceFromHtml = fromHtml(str);
                }
                if (charSequenceFromHtml != null) {
                    ((ArrayList) lVar.f5145f).add(b0.p.b(charSequenceFromHtml));
                }
            }
        }
        pVar.e(lVar);
    }

    private static void setLights(NotificationDetails notificationDetails, b0.p pVar) {
        if (!BooleanUtils.getValue(notificationDetails.enableLights) || notificationDetails.ledOnMs == null || notificationDetails.ledOffMs == null) {
            return;
        }
        int iIntValue = notificationDetails.ledColor.intValue();
        int iIntValue2 = notificationDetails.ledOnMs.intValue();
        int iIntValue3 = notificationDetails.ledOffMs.intValue();
        Notification notification = pVar.G;
        notification.ledARGB = iIntValue;
        notification.ledOnMS = iIntValue2;
        notification.ledOffMS = iIntValue3;
        notification.flags = ((iIntValue2 == 0 || iIntValue3 == 0) ? 0 : 1) | (notification.flags & (-2));
    }

    private static void setMediaStyle(b0.p pVar) {
        pVar.e(new u(1));
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, b0.p pVar) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        b0 b0Var = new b0(buildPerson(context, messagingStyleInformation.person));
        b0Var.f5085i = Boolean.valueOf(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            b0Var.f5084h = str;
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                a0 a0VarCreateMessage = createMessage(context, it.next());
                if (a0VarCreateMessage != null) {
                    ArrayList arrayList2 = b0Var.f5081e;
                    arrayList2.add(a0VarCreateMessage);
                    if (arrayList2.size() > 25) {
                        arrayList2.remove(0);
                    }
                }
            }
        }
        pVar.e(b0Var);
    }

    private static void setProgress(NotificationDetails notificationDetails, b0.p pVar) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            int iIntValue = notificationDetails.maxProgress.intValue();
            int iIntValue2 = notificationDetails.progress.intValue();
            boolean zBooleanValue = notificationDetails.indeterminate.booleanValue();
            pVar.f5180p = iIntValue;
            pVar.f5181q = iIntValue2;
            pVar.f5182r = zBooleanValue;
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, b0.p pVar) {
        if (!StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            pVar.G.icon = getDrawableResourceId(context, notificationDetails.icon);
            return;
        }
        String string = context.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).getString(DEFAULT_ICON, null);
        if (StringUtils.isNullOrEmpty(string).booleanValue()) {
            pVar.G.icon = notificationDetails.iconResourceId.intValue();
        } else {
            pVar.G.icon = getDrawableResourceId(context, string);
        }
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, b0.p pVar) {
        if (BooleanUtils.getValue(notificationDetails.playSound)) {
            pVar.d(retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource));
        } else {
            pVar.d(null);
        }
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, b0.p pVar) {
        int i10 = e.f10549c[notificationDetails.style.ordinal()];
        if (i10 == 1) {
            setBigPictureStyle(context, notificationDetails, pVar);
            return;
        }
        if (i10 == 2) {
            setBigTextStyle(notificationDetails, pVar);
            return;
        }
        if (i10 == 3) {
            setInboxStyle(notificationDetails, pVar);
        } else if (i10 == 4) {
            setMessagingStyle(context, notificationDetails, pVar);
        } else {
            if (i10 != 5) {
                return;
            }
            setMediaStyle(pVar);
        }
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, b0.p pVar) {
        Long l = notificationDetails.timeoutAfter;
        if (l == null) {
            return;
        }
        pVar.D = l.longValue();
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, b0.p pVar) {
        if (!BooleanUtils.getValue(notificationDetails.enableVibration)) {
            pVar.G.vibrate = new long[]{0};
            return;
        }
        long[] jArr = notificationDetails.vibrationPattern;
        if (jArr == null || jArr.length <= 0) {
            return;
        }
        pVar.G.vibrate = jArr;
    }

    private static void setVisibility(NotificationDetails notificationDetails, b0.p pVar) {
        int i10;
        Integer num = notificationDetails.visibility;
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            i10 = 1;
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    throw new IllegalArgumentException("Unknown index: " + notificationDetails.visibility);
                }
                i10 = -1;
            }
        } else {
            i10 = 0;
        }
        pVar.A = i10;
    }

    private static void setupAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j10, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, j10, pendingIntent);
            return;
        }
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setExact(0, j10, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            alarmManager.set(0, j10, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j10, pendingIntent), pendingIntent);
        }
    }

    private static void setupAllowWhileIdleAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j10, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setExactAndAllowWhileIdle(0, j10, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            alarmManager.setAndAllowWhileIdle(0, j10, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j10, pendingIntent), pendingIntent);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel(notificationChannelDetails.f10561id, notificationChannelDetails.name, notificationChannelDetails.importance.intValue());
        notificationChannel.setDescription(notificationChannelDetails.description);
        notificationChannel.setGroup(notificationChannelDetails.groupId);
        if (notificationChannelDetails.playSound.booleanValue()) {
            Integer num2 = notificationChannelDetails.audioAttributesUsage;
            notificationChannel.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(num2 != null ? num2.intValue() : 5).build());
        } else {
            notificationChannel.setSound(null, null);
        }
        if (BooleanUtils.getValue(notificationChannelDetails.bypassDnd)) {
            if (notificationManager.isNotificationPolicyAccessGranted()) {
                notificationChannel.setBypassDnd(true);
            } else {
                Log.w(TAG, "Channel '" + notificationChannelDetails.name + "' was set to bypass Do Not Disturb but the OS prevents it.");
            }
        }
        notificationChannel.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
        long[] jArr = notificationChannelDetails.vibrationPattern;
        if (jArr != null && jArr.length > 0) {
            notificationChannel.setVibrationPattern(jArr);
        }
        boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
        notificationChannel.enableLights(value);
        if (value && (num = notificationChannelDetails.ledColor) != null) {
            notificationChannel.setLightColor(num.intValue());
        }
        notificationChannel.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private void show(m mVar, o oVar) {
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(oVar, (Map) mVar.f53823b);
        if (notificationDetailsExtractNotificationDetails != null) {
            showNotification(this.applicationContext, notificationDetailsExtractNotificationDetails);
            oVar.a(null);
        }
    }

    public static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification notificationCreateNotification = createNotification(context, notificationDetails);
        l0 notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        if (str != null) {
            notificationManager.b(str, notificationDetails.f10563id.intValue(), notificationCreateNotification);
        } else {
            notificationManager.b(null, notificationDetails.f10563id.intValue(), notificationCreateNotification);
        }
    }

    private void startForegroundService(m mVar, o oVar) {
        Map<String, Object> map = (Map) mVar.a("notificationData");
        Integer num = (Integer) mVar.a("startType");
        ArrayList arrayList = (ArrayList) mVar.a("foregroundServiceTypes");
        if (arrayList != null && arrayList.size() == 0) {
            oVar.b("ARGUMENT_ERROR", "If foregroundServiceTypes is non-null it must not be empty!", null);
            return;
        }
        if (map == null || num == null) {
            oVar.b("ARGUMENT_ERROR", "An argument passed to startForegroundService was null!", null);
            return;
        }
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(oVar, map);
        if (notificationDetailsExtractNotificationDetails != null) {
            if (notificationDetailsExtractNotificationDetails.f10563id.intValue() == 0) {
                oVar.b("ARGUMENT_ERROR", "The id of the notification for a foreground service must not be 0!", null);
                return;
            }
            i iVar = new i(notificationDetailsExtractNotificationDetails, num.intValue(), arrayList);
            Intent intent = new Intent(this.applicationContext, (Class<?>) h.class);
            intent.putExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", iVar);
            this.applicationContext.startForegroundService(intent);
            oVar.a(null);
        }
    }

    private void stopForegroundService(o oVar) {
        this.applicationContext.stopService(new Intent(this.applicationContext, (Class<?>) h.class));
        oVar.a(null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(m mVar, o oVar) {
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(oVar, (Map) mVar.f53823b);
        if (notificationDetailsExtractNotificationDetails != null) {
            if (notificationDetailsExtractNotificationDetails.matchDateTimeComponents != null) {
                notificationDetailsExtractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(notificationDetailsExtractNotificationDetails);
            }
            try {
                zonedScheduleNotification(this.applicationContext, notificationDetailsExtractNotificationDetails, Boolean.TRUE);
                oVar.a(null);
            } catch (f e10) {
                oVar.b(e10.f10550a, e10.getMessage(), null);
            }
        }
    }

    private static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDate;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String strF = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strF);
        setupAlarm(notificationDetails, getAlarmManager(context), ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli(), getBroadcastPendingIntent(context, notificationDetails.f10563id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public void hasNotificationPolicyAccess(o oVar) {
        oVar.a(Boolean.valueOf(((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted()));
    }

    @Override // xi.r
    public boolean onActivityResult(int i10, int i11, @Nullable Intent intent) {
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            return false;
        }
        g gVar = this.permissionRequestProgress;
        g gVar2 = g.f10554d;
        g gVar3 = g.f10551a;
        if (gVar == gVar2 && i10 == 2 && Build.VERSION.SDK_INT >= 31) {
            this.callback.b(getAlarmManager(this.applicationContext).canScheduleExactAlarms());
            this.permissionRequestProgress = gVar3;
        }
        if (this.permissionRequestProgress == g.f10555e && i10 == 3 && Build.VERSION.SDK_INT >= 34) {
            this.callback.b(((NotificationManager) this.applicationContext.getSystemService("notification")).canUseFullScreenIntent());
            this.permissionRequestProgress = gVar3;
        }
        if (this.permissionRequestProgress == g.f10553c && i10 == 4) {
            this.callback.b(((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted());
            this.permissionRequestProgress = gVar3;
        }
        return true;
    }

    @Override // ui.a
    public void onAttachedToActivity(ui.b bVar) {
        fc.f fVar = (fc.f) bVar;
        fVar.d(this);
        fVar.e(this);
        fVar.b(this);
        Activity activity = (Activity) fVar.f40780b;
        this.mainActivity = activity;
        Intent intent = activity.getIntent();
        if (launchedActivityFromHistory(intent) || !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return;
        }
        processForegroundNotificationAction(intent, extractNotificationResponseMap(intent));
    }

    @Override // ti.b
    public void onAttachedToEngine(ti.a aVar) {
        this.applicationContext = aVar.f50787a;
        p pVar = new p(aVar.f50789c, METHOD_CHANNEL);
        this.channel = pVar;
        pVar.b(this);
    }

    @Override // ui.a
    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    @Override // ui.a
    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    @Override // ti.b
    public void onDetachedFromEngine(@NonNull ti.a aVar) {
        this.channel.b(null);
        this.channel = null;
        this.applicationContext = null;
    }

    @Override // xi.n
    public void onMethodCall(m mVar, @NonNull o oVar) {
        String str = mVar.f53822a;
        str.getClass();
        switch (str) {
            case "stopForegroundService":
                stopForegroundService(oVar);
                break;
            case "getNotificationChannels":
                getNotificationChannels(oVar);
                break;
            case "deleteNotificationChannelGroup":
                deleteNotificationChannelGroup(mVar, oVar);
                break;
            case "requestNotificationsPermission":
                requestNotificationsPermission(new com.dexterous.flutterlocalnotifications.a(oVar));
                break;
            case "hasNotificationPolicyAccess":
                hasNotificationPolicyAccess(oVar);
                break;
            case "cancel":
                cancel(mVar, oVar);
                break;
            case "requestExactAlarmsPermission":
                requestExactAlarmsPermission(new b(oVar));
                break;
            case "requestFullScreenIntentPermission":
                requestFullScreenIntentPermission(new c(oVar));
                break;
            case "pendingNotificationRequests":
                pendingNotificationRequests(oVar);
                break;
            case "cancelAllPendingNotifications":
                cancelAllPendingNotifications(oVar);
                break;
            case "getNotificationAppLaunchDetails":
                getNotificationAppLaunchDetails(oVar);
                break;
            case "show":
                show(mVar, oVar);
                break;
            case "periodicallyShow":
                repeat(mVar, oVar);
                break;
            case "getActiveNotificationMessagingStyle":
                getActiveNotificationMessagingStyle(mVar, oVar);
                break;
            case "cancelAll":
                cancelAllNotifications(oVar);
                break;
            case "zonedSchedule":
                zonedSchedule(mVar, oVar);
                break;
            case "createNotificationChannelGroup":
                createNotificationChannelGroup(mVar, oVar);
                break;
            case "getCallbackHandle":
                getCallbackHandle(oVar);
                break;
            case "initialize":
                initialize(mVar, oVar);
                break;
            case "areNotificationsEnabled":
                areNotificationsEnabled(oVar);
                break;
            case "canScheduleExactNotifications":
                setCanScheduleExactNotifications(oVar);
                break;
            case "deleteNotificationChannel":
                deleteNotificationChannel(mVar, oVar);
                break;
            case "startForegroundService":
                startForegroundService(mVar, oVar);
                break;
            case "getActiveNotifications":
                getActiveNotifications(oVar);
                break;
            case "createNotificationChannel":
                createNotificationChannel(mVar, oVar);
                break;
            case "requestNotificationPolicyAccess":
                requestNotificationPolicyAccess(new d(oVar));
                break;
            case "periodicallyShowWithDuration":
                repeat(mVar, oVar);
                break;
            default:
                oVar.c();
                break;
        }
    }

    @Override // xi.s
    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean zBooleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (zBooleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return zBooleanValue;
    }

    @Override // ui.a
    public void onReattachedToActivityForConfigChanges(ui.b bVar) {
        fc.f fVar = (fc.f) bVar;
        fVar.d(this);
        fVar.e(this);
        fVar.b(this);
        this.mainActivity = (Activity) fVar.f40780b;
    }

    @Override // xi.t
    public boolean onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        boolean z10 = false;
        if (this.permissionRequestProgress == g.f10552b && i10 == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z10 = true;
            }
            this.callback.b(z10);
            this.permissionRequestProgress = g.f10551a;
        }
        return z10;
    }

    public void requestExactAlarmsPermission(@NonNull j jVar) {
        g gVar = this.permissionRequestProgress;
        g gVar2 = g.f10551a;
        if (gVar != gVar2) {
            jVar.a();
            return;
        }
        this.callback = jVar;
        if (Build.VERSION.SDK_INT < 31) {
            jVar.b(true);
            return;
        }
        if (getAlarmManager(this.applicationContext).canScheduleExactAlarms()) {
            this.callback.b(true);
            this.permissionRequestProgress = gVar2;
            return;
        }
        this.permissionRequestProgress = g.f10554d;
        this.mainActivity.startActivityForResult(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + this.applicationContext.getPackageName())), 2);
    }

    public void requestFullScreenIntentPermission(@NonNull j jVar) {
        g gVar = this.permissionRequestProgress;
        g gVar2 = g.f10551a;
        if (gVar != gVar2) {
            jVar.a();
            return;
        }
        this.callback = jVar;
        if (Build.VERSION.SDK_INT < 34) {
            jVar.b(true);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        getAlarmManager(this.applicationContext);
        if (notificationManager.canUseFullScreenIntent()) {
            this.callback.b(true);
            this.permissionRequestProgress = gVar2;
            return;
        }
        this.permissionRequestProgress = g.f10555e;
        this.mainActivity.startActivityForResult(new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.parse("package:" + this.applicationContext.getPackageName())), 3);
    }

    public void requestNotificationPolicyAccess(@NonNull j jVar) {
        g gVar = this.permissionRequestProgress;
        g gVar2 = g.f10551a;
        if (gVar != gVar2) {
            jVar.a();
            return;
        }
        this.callback = jVar;
        if (((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted()) {
            this.callback.b(true);
            this.permissionRequestProgress = gVar2;
        } else {
            this.permissionRequestProgress = g.f10553c;
            this.mainActivity.startActivityForResult(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"), 4);
        }
    }

    public void requestNotificationsPermission(@NonNull j jVar) {
        g gVar = this.permissionRequestProgress;
        g gVar2 = g.f10551a;
        if (gVar != gVar2) {
            jVar.a();
            return;
        }
        this.callback = jVar;
        if (Build.VERSION.SDK_INT < 33) {
            this.callback.b(new l0(this.mainActivity).f5152b.areNotificationsEnabled());
        } else if (b0.b.a(this.mainActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
            this.callback.b(true);
            this.permissionRequestProgress = gVar2;
        } else {
            this.permissionRequestProgress = g.f10552b;
            b0.b.i(this.mainActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }
}
