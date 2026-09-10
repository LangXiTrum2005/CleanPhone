package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import com.thinkup.core.common.n.mo;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f48685a = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Set<String> f48686b = new HashSet();

    public static class a extends AsyncTask<String, Void, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f48695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0877a f48696b;

        /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.h$a$a, reason: collision with other inner class name */
        public interface InterfaceC0877a {
            void a();

            void b();
        }

        public a(Context context, InterfaceC0877a interfaceC0877a) {
            this.f48695a = context.getApplicationContext();
            this.f48696b = interfaceC0877a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String[] strArr) throws Throwable {
            FileOutputStream fileOutputStream;
            FileOutputStream fileOutputStream2;
            Boolean bool;
            InputStream inputStream;
            if (strArr != null && strArr.length != 0) {
                byte b2 = 0;
                if (strArr[0] != null) {
                    File fileD = sg.bigo.ads.common.utils.p.d();
                    fileD.mkdirs();
                    String str = strArr[0];
                    BufferedInputStream bufferedInputStream = null;
                    try {
                        sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(new sg.bigo.ads.common.u.b.d(str), this.f48695a);
                        aVar.k = sg.bigo.ads.common.u.a.e.a();
                        sg.bigo.ads.common.u.c<sg.bigo.ads.common.u.c.a> cVarA = sg.bigo.ads.common.u.g.a(aVar);
                        T t = cVarA.f47475a;
                        if (t != 0 && (inputStream = ((sg.bigo.ads.common.u.c.a) t).f47478b) != null) {
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
                            try {
                                File file = new File(fileD, a(str, ((sg.bigo.ads.common.u.c.a) cVarA.f47475a).f47479c));
                                fileOutputStream2 = new FileOutputStream(file);
                                try {
                                    a(bufferedInputStream2, fileOutputStream2);
                                    b bVar = new b(file.toString(), b2);
                                    MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(this.f48695a, bVar);
                                    bVar.f48699c = mediaScannerConnection;
                                    mediaScannerConnection.connect();
                                    bool = Boolean.TRUE;
                                    a(bufferedInputStream2);
                                } catch (Exception unused) {
                                    bufferedInputStream = bufferedInputStream2;
                                    try {
                                        bool = Boolean.FALSE;
                                        a(bufferedInputStream);
                                    } catch (Throwable th) {
                                        fileOutputStream = fileOutputStream2;
                                        th = th;
                                        a(bufferedInputStream);
                                        a(fileOutputStream);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    fileOutputStream = fileOutputStream2;
                                    th = th2;
                                    bufferedInputStream = bufferedInputStream2;
                                    a(bufferedInputStream);
                                    a(fileOutputStream);
                                    throw th;
                                }
                            } catch (Exception unused2) {
                                fileOutputStream2 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = null;
                            }
                            a(fileOutputStream2);
                            return bool;
                        }
                        Boolean bool2 = Boolean.FALSE;
                        a((Closeable) null);
                        a((Closeable) null);
                        return bool2;
                    } catch (Exception unused3) {
                        fileOutputStream2 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                    }
                }
            }
            return Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 == null || !bool2.booleanValue()) {
                this.f48696b.b();
            } else {
                this.f48696b.a();
            }
        }

        private static String a(String str, sg.bigo.ads.common.utils.h<List<String>> hVar) {
            if (hVar == null) {
                return null;
            }
            String name = new File(String.valueOf(str.hashCode())).getName();
            List<String> listA = hVar.a("content-type");
            if (listA != null && !listA.isEmpty()) {
                if (listA.get(0) != null) {
                    for (String str2 : listA.get(0).split(";")) {
                        if (str2.contains("image/")) {
                            String str3 = mo.ono + str2.split("/")[1];
                            if (name.endsWith(str3)) {
                                break;
                            }
                            return android.support.v4.media.a.m(name, str3);
                        }
                    }
                }
            }
            return name;
        }

        private static void a(Closeable closeable) {
            if (closeable == null) {
                return;
            }
            try {
                closeable.close();
            } catch (Exception unused) {
                sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Unable to close stream. Ignoring.");
            }
        }

        private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
            byte[] bArr = new byte[16384];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i2);
                }
            }
        }
    }

    public static class b implements MediaScannerConnection.MediaScannerConnectionClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f48698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaScannerConnection f48699c;

        private b(String str) {
            this.f48697a = str;
            this.f48698b = null;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public final void onMediaScannerConnected() {
            MediaScannerConnection mediaScannerConnection = this.f48699c;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.scanFile(this.f48697a, this.f48698b);
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public final void onScanCompleted(String str, Uri uri) {
            MediaScannerConnection mediaScannerConnection = this.f48699c;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.disconnect();
            }
        }

        public /* synthetic */ b(String str, byte b2) {
            this(str);
        }
    }

    public interface c {
        void a(d dVar);
    }

    private static Date a(String str) {
        Date date = null;
        for (String str2 : f48685a) {
            try {
                date = new SimpleDateFormat(str2, Locale.US).parse(str);
                if (date != null) {
                    break;
                }
            } catch (ParseException unused) {
            }
        }
        return date;
    }

    private static String b(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = new boolean[7];
        String[] strArrSplit = str.split(",");
        for (String str3 : strArrSplit) {
            int i2 = Integer.parseInt(str3);
            if (i2 == 7) {
                i2 = 0;
            }
            if (!zArr[i2]) {
                StringBuilder sb2 = new StringBuilder();
                switch (i2) {
                    case 0:
                        str2 = "SU";
                        break;
                    case 1:
                        str2 = "MO";
                        break;
                    case 2:
                        str2 = "TU";
                        break;
                    case 3:
                        str2 = "WE";
                        break;
                    case 4:
                        str2 = "TH";
                        break;
                    case 5:
                        str2 = "FR";
                        break;
                    case 6:
                        str2 = "SA";
                        break;
                    default:
                        throw new IllegalArgumentException("invalid day of week ".concat(String.valueOf(i2)));
                }
                sb2.append(str2);
                sb2.append(",");
                sb.append(sb2.toString());
                zArr[i2] = true;
            }
        }
        if (strArrSplit.length == 0) {
            throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private static String c(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = new boolean[63];
        String[] strArrSplit = str.split(",");
        for (String str2 : strArrSplit) {
            int i2 = Integer.parseInt(str2);
            int i3 = i2 + 31;
            if (!zArr[i3]) {
                StringBuilder sb2 = new StringBuilder();
                if (i2 == 0 || i2 < -31 || i2 > 31) {
                    throw new IllegalArgumentException("invalid day of month ".concat(String.valueOf(i2)));
                }
                sb2.append(String.valueOf(i2));
                sb2.append(",");
                sb.append(sb2.toString());
                zArr[i3] = true;
            }
        }
        if (strArrSplit.length == 0) {
            throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static boolean d(Context context) {
        return a(context, new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"));
    }

    public static boolean b(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return a(context, intent);
    }

    public static boolean c(Context context) {
        return "mounted".equals(Environment.getExternalStorageState()) && a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public final void a(final Context context, String str, final c cVar) {
        if (f48686b.contains(str)) {
            sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "Image downloading task has been created");
        } else {
            f48686b.add(str);
            a(new a(context, new a.InterfaceC0877a() { // from class: sg.bigo.ads.core.mraid.h.1
                @Override // sg.bigo.ads.core.mraid.h.a.InterfaceC0877a
                public final void a() {
                    sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "Image successfully saved.");
                }

                @Override // sg.bigo.ads.core.mraid.h.a.InterfaceC0877a
                public final void b() {
                    Toast.makeText(context, "Image failed to download.", 0).show();
                    sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Error downloading and saving image file.");
                    cVar.a(new d("Error downloading and saving image file."));
                }
            }), str);
        }
    }

    public static void a(Context context, Map<String, String> map) throws d {
        String str;
        if (!d(context)) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "unsupported action createCalendarEvent for devices pre-ICS");
            throw new d("Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
        }
        try {
            HashMap map2 = new HashMap();
            if (!map.containsKey("description") || !map.containsKey("start")) {
                throw new IllegalArgumentException("Missing start and description fields");
            }
            map2.put("title", map.get("description"));
            if (!map.containsKey("start") || map.get("start") == null) {
                throw new IllegalArgumentException("Invalid calendar event: start is null.");
            }
            Date dateA = a(map.get("start"));
            if (dateA == null) {
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            map2.put("beginTime", Long.valueOf(dateA.getTime()));
            if (map.containsKey(TtmlNode.END) && map.get(TtmlNode.END) != null) {
                Date dateA2 = a(map.get(TtmlNode.END));
                if (dateA2 == null) {
                    throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                }
                map2.put("endTime", Long.valueOf(dateA2.getTime()));
            }
            if (map.containsKey("location")) {
                map2.put("eventLocation", map.get("location"));
            }
            if (map.containsKey("summary")) {
                map2.put("description", map.get("summary"));
            }
            if (map.containsKey("transparency")) {
                map2.put("availability", Integer.valueOf(map.get("transparency").equals(d9.h.T) ? 1 : 0));
            }
            StringBuilder sb = new StringBuilder();
            if (map.containsKey("frequency")) {
                String str2 = map.get("frequency");
                int i2 = map.containsKey("interval") ? Integer.parseInt(map.get("interval")) : -1;
                if ("daily".equals(str2)) {
                    sb.append("FREQ=DAILY;");
                    if (i2 != -1) {
                        str = "INTERVAL=" + i2 + ";";
                        sb.append(str);
                    }
                } else if ("weekly".equals(str2)) {
                    sb.append("FREQ=WEEKLY;");
                    if (i2 != -1) {
                        sb.append("INTERVAL=" + i2 + ";");
                    }
                    if (map.containsKey("daysInWeek")) {
                        String strB = b(map.get("daysInWeek"));
                        if (strB == null) {
                            throw new IllegalArgumentException("invalid ");
                        }
                        str = "BYDAY=" + strB + ";";
                        sb.append(str);
                    }
                } else {
                    if (!"monthly".equals(str2)) {
                        throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                    }
                    sb.append("FREQ=MONTHLY;");
                    if (i2 != -1) {
                        sb.append("INTERVAL=" + i2 + ";");
                    }
                    if (map.containsKey("daysInMonth")) {
                        String strC = c(map.get("daysInMonth"));
                        if (strC == null) {
                            throw new IllegalArgumentException();
                        }
                        str = "BYMONTHDAY=" + strC + ";";
                        sb.append(str);
                    }
                }
            }
            map2.put("rrule", sb.toString());
            Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
            for (String str3 : map2.keySet()) {
                Object obj = map2.get(str3);
                if (obj instanceof Long) {
                    type.putExtra(str3, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    type.putExtra(str3, ((Integer) obj).intValue());
                } else {
                    type.putExtra(str3, (String) obj);
                }
            }
            type.setFlags(268435456);
            context.startActivity(type);
        } catch (ActivityNotFoundException unused) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "no calendar app installed");
            throw new d("Action is unsupported on this device - no calendar app installed");
        } catch (IllegalArgumentException e2) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "create calendar: invalid parameters " + e2.getMessage());
            throw new d(e2);
        } catch (Exception e3) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "could not create calendar event");
            throw new d(e3);
        }
    }

    private static <P> void a(final AsyncTask<P, ?, ?> asyncTask, final P... pArr) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, pArr);
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "Posting AsyncTask to main thread for execution.");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sg.bigo.ads.core.mraid.h.2
                @Override // java.lang.Runnable
                public final void run() {
                    asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, pArr);
                }
            });
        }
    }

    public static boolean a(Activity activity) {
        return (activity.getWindow() == null || (activity.getWindow().getAttributes().flags & 16777216) == 0) ? false : true;
    }

    public static boolean a(Context context) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return a(context, intent);
    }

    private static boolean a(Context context, Intent intent) {
        try {
            return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
        } catch (Exception unused) {
        }
    }

    private static boolean a(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        } catch (Exception unused) {
        }
    }
}
