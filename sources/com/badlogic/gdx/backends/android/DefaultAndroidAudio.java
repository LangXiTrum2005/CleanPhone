package com.badlogic.gdx.backends.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.audio.AudioDevice;
import com.badlogic.gdx.audio.AudioRecorder;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DefaultAndroidAudio implements AndroidAudio {
    private final AudioManager manager;
    private final List<AndroidMusic> musics = new ArrayList();
    private final SoundPool soundPool;

    public DefaultAndroidAudio(Context context, AndroidApplicationConfiguration androidApplicationConfiguration) {
        this.soundPool = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).setMaxStreams(androidApplicationConfiguration.maxSimultaneousSounds).build();
        this.manager = (AudioManager) context.getSystemService("audio");
        if (context instanceof Activity) {
            ((Activity) context).setVolumeControlStream(3);
        }
    }

    public MediaPlayer createMediaPlayer() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (Build.VERSION.SDK_INT <= 21) {
            mediaPlayer.setAudioStreamType(3);
        } else {
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(14).build());
        }
        return mediaPlayer;
    }

    public void dispose() {
        synchronized (this.musics) {
            try {
                Iterator it = new ArrayList(this.musics).iterator();
                while (it.hasNext()) {
                    ((AndroidMusic) it.next()).dispose();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.soundPool.release();
    }

    @Override // com.badlogic.gdx.Audio
    public String[] getAvailableOutputDevices() {
        return new String[0];
    }

    @Override // com.badlogic.gdx.Audio
    public AudioDevice newAudioDevice(int i, boolean z) {
        return new AndroidAudioDevice(i, z);
    }

    @Override // com.badlogic.gdx.Audio
    public AudioRecorder newAudioRecorder(int i, boolean z) {
        return new AndroidAudioRecorder(i, z);
    }

    @Override // com.badlogic.gdx.Audio
    public Music newMusic(FileHandle fileHandle) {
        AndroidFileHandle androidFileHandle = (AndroidFileHandle) fileHandle;
        MediaPlayer mediaPlayerCreateMediaPlayer = createMediaPlayer();
        if (androidFileHandle.type() != Files.FileType.Internal) {
            try {
                mediaPlayerCreateMediaPlayer.setDataSource(androidFileHandle.file().getPath());
                mediaPlayerCreateMediaPlayer.prepare();
                AndroidMusic androidMusic = new AndroidMusic(this, mediaPlayerCreateMediaPlayer);
                synchronized (this.musics) {
                    this.musics.add(androidMusic);
                }
                return androidMusic;
            } catch (Exception e) {
                throw new GdxRuntimeException(AbstractC5044xl.k("Error loading audio file: ", fileHandle), e);
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptor = androidFileHandle.getAssetFileDescriptor();
            mediaPlayerCreateMediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            assetFileDescriptor.close();
            mediaPlayerCreateMediaPlayer.prepare();
            AndroidMusic androidMusic2 = new AndroidMusic(this, mediaPlayerCreateMediaPlayer);
            synchronized (this.musics) {
                this.musics.add(androidMusic2);
            }
            return androidMusic2;
        } catch (Exception e2) {
            throw new GdxRuntimeException("Error loading audio file: " + fileHandle + "\nNote: Internal audio files must be placed in the assets directory.", e2);
        }
    }

    @Override // com.badlogic.gdx.Audio
    public Sound newSound(FileHandle fileHandle) {
        AndroidFileHandle androidFileHandle = (AndroidFileHandle) fileHandle;
        if (androidFileHandle.type() != Files.FileType.Internal) {
            try {
                SoundPool soundPool = this.soundPool;
                return new AndroidSound(soundPool, this.manager, soundPool.load(androidFileHandle.file().getPath(), 1));
            } catch (Exception e) {
                throw new GdxRuntimeException(AbstractC5044xl.k("Error loading audio file: ", fileHandle), e);
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptor = androidFileHandle.getAssetFileDescriptor();
            SoundPool soundPool2 = this.soundPool;
            AndroidSound androidSound = new AndroidSound(soundPool2, this.manager, soundPool2.load(assetFileDescriptor, 1));
            assetFileDescriptor.close();
            return androidSound;
        } catch (IOException e2) {
            throw new GdxRuntimeException("Error loading audio file: " + fileHandle + "\nNote: Internal audio files must be placed in the assets directory.", e2);
        }
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public void notifyMusicDisposed(AndroidMusic androidMusic) {
        synchronized (this.musics) {
            this.musics.remove(this);
        }
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public void pause() {
        synchronized (this.musics) {
            try {
                for (AndroidMusic androidMusic : this.musics) {
                    if (androidMusic.isPlaying()) {
                        androidMusic.pause();
                        androidMusic.wasPlaying = true;
                    } else {
                        androidMusic.wasPlaying = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.soundPool.autoPause();
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public void resume() {
        synchronized (this.musics) {
            for (int i = 0; i < this.musics.size(); i++) {
                try {
                    if (this.musics.get(i).wasPlaying) {
                        this.musics.get(i).play();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.soundPool.autoResume();
    }

    @Override // com.badlogic.gdx.Audio
    public boolean switchOutputDevice(String str) {
        return true;
    }

    public Music newMusic(FileDescriptor fileDescriptor) {
        MediaPlayer mediaPlayerCreateMediaPlayer = createMediaPlayer();
        try {
            mediaPlayerCreateMediaPlayer.setDataSource(fileDescriptor);
            mediaPlayerCreateMediaPlayer.prepare();
            AndroidMusic androidMusic = new AndroidMusic(this, mediaPlayerCreateMediaPlayer);
            synchronized (this.musics) {
                this.musics.add(androidMusic);
            }
            return androidMusic;
        } catch (Exception e) {
            throw new GdxRuntimeException("Error loading audio from FileDescriptor", e);
        }
    }
}
