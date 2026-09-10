package com.startapp.sdk.internal;

import android.content.Context;
import android.content.pm.ActivityInfo;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.video.VideoUtil$VideoEligibility;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gk {
    public static void a(Context context, kj kjVar) {
        if (context == null || kjVar == null) {
            return;
        }
        for (String str : kjVar.f41190a) {
            if (str != null && str.length() > 0) {
                ji.a(context, str, null);
            }
        }
    }

    public static VideoUtil$VideoEligibility a(Context context) {
        VideoUtil$VideoEligibility videoUtil$VideoEligibility = VideoUtil$VideoEligibility.ELIGIBLE;
        int i2 = 0;
        if (AdsCommonMetaData.k().F().p() >= 0 && ((vf) com.startapp.sdk.components.a.a(context).G.a()).getInt("videoErrorsCount", 0) >= AdsCommonMetaData.k().F().p()) {
            videoUtil$VideoEligibility = VideoUtil$VideoEligibility.INELIGIBLE_ERRORS_THRESHOLD_REACHED;
        }
        WeakHashMap weakHashMap = vi.f41589a;
        try {
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            int length = activityInfoArr.length;
            while (true) {
                if (i2 < length) {
                    if (activityInfoArr[i2].name.equals(OverlayActivity.class.getName())) {
                        break;
                    }
                    i2++;
                } else {
                    videoUtil$VideoEligibility = VideoUtil$VideoEligibility.INELIGIBLE_MISSING_ACTIVITY;
                    break;
                }
            }
        } catch (Exception unused) {
        }
        File filesDir = context.getFilesDir();
        WeakHashMap weakHashMap2 = vi.f41589a;
        long jA = q0.a(filesDir);
        return (jA >= 0 && jA / 1024 > AdsCommonMetaData.k().F().g() * 1024) ? videoUtil$VideoEligibility : VideoUtil$VideoEligibility.INELIGIBLE_NO_STORAGE;
    }

    public static String a(Context context, URL url, String str) throws Throwable {
        DataInputStream dataInputStream;
        FileOutputStream fileOutputStreamOpenFileOutput;
        InputStream inputStreamOpenStream;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        str = null;
        String str2 = null;
        try {
            String str3 = context.getFilesDir() + "/" + str;
            File file = new File(str3);
            try {
                try {
                    if (!file.exists()) {
                        inputStreamOpenStream = url.openStream();
                        try {
                            dataInputStream = new DataInputStream(inputStreamOpenStream);
                            try {
                                byte[] bArr = new byte[4096];
                                fileOutputStreamOpenFileOutput = context.openFileOutput(str + ".temp", 0);
                                while (true) {
                                    try {
                                        try {
                                            int i2 = dataInputStream.read(bArr);
                                            if (i2 <= 0) {
                                                break;
                                            }
                                            fileOutputStreamOpenFileOutput.write(bArr, 0, i2);
                                        } catch (Throwable th) {
                                            th = th;
                                            fileOutputStream = fileOutputStreamOpenFileOutput;
                                            fileOutputStreamOpenFileOutput = fileOutputStream;
                                            try {
                                                inputStreamOpenStream.close();
                                                dataInputStream.close();
                                                fileOutputStreamOpenFileOutput.close();
                                            } catch (Exception unused) {
                                            }
                                            throw th;
                                        }
                                    } catch (Exception unused2) {
                                        new File(context.getFilesDir() + "/" + (str + ".temp")).delete();
                                        inputStreamOpenStream.close();
                                        dataInputStream.close();
                                    }
                                }
                                try {
                                    new File(context.getFilesDir() + "/" + (str + ".temp")).renameTo(file);
                                    try {
                                        inputStreamOpenStream.close();
                                        dataInputStream.close();
                                        str2 = str3;
                                        fileOutputStreamOpenFileOutput.close();
                                        return str2;
                                    } catch (Exception unused3) {
                                        return str3;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStreamOpenStream.close();
                                    dataInputStream.close();
                                    fileOutputStreamOpenFileOutput.close();
                                    throw th;
                                }
                            } catch (Exception unused4) {
                                fileOutputStreamOpenFileOutput = null;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Exception unused5) {
                            dataInputStream = null;
                            fileOutputStreamOpenFileOutput = null;
                        } catch (Throwable th4) {
                            th = th4;
                            dataInputStream = null;
                            fileOutputStreamOpenFileOutput = null;
                            inputStream = inputStreamOpenStream;
                            inputStreamOpenStream = inputStream;
                            inputStreamOpenStream.close();
                            dataInputStream.close();
                            fileOutputStreamOpenFileOutput.close();
                            throw th;
                        }
                    } else {
                        try {
                            throw null;
                        } catch (Exception unused6) {
                            return str3;
                        }
                    }
                    inputStreamOpenStream.close();
                    dataInputStream.close();
                    fileOutputStreamOpenFileOutput.close();
                    return str2;
                } catch (Exception unused7) {
                    return str2;
                }
                new File(context.getFilesDir() + "/" + (str + ".temp")).delete();
            } catch (Throwable th5) {
                th = th5;
                inputStream = inputStreamOpenStream;
                inputStreamOpenStream = inputStream;
                inputStreamOpenStream.close();
                dataInputStream.close();
                fileOutputStreamOpenFileOutput.close();
                throw th;
            }
        } catch (Exception unused8) {
            inputStreamOpenStream = null;
        } catch (Throwable th6) {
            th = th6;
            dataInputStream = null;
            fileOutputStreamOpenFileOutput = null;
            inputStreamOpenStream = inputStream;
            inputStreamOpenStream.close();
            dataInputStream.close();
            fileOutputStreamOpenFileOutput.close();
            throw th;
        }
        dataInputStream = null;
        fileOutputStreamOpenFileOutput = null;
    }
}
