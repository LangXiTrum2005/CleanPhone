package com.badlogic.gdx.graphics.g2d;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.ObjectSet;
import com.badlogic.gdx.utils.StreamUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.BufferedReader;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class TextureAtlas implements Disposable {
    private final Array<AtlasRegion> regions;
    private final ObjectSet<Texture> textures;

    public TextureAtlas() {
        this.textures = new ObjectSet<>(4);
        this.regions = new Array<>();
    }

    private Sprite newSprite(AtlasRegion atlasRegion) {
        if (atlasRegion.packedWidth != atlasRegion.originalWidth || atlasRegion.packedHeight != atlasRegion.originalHeight) {
            return new AtlasSprite(atlasRegion);
        }
        if (!atlasRegion.rotate) {
            return new Sprite(atlasRegion);
        }
        Sprite sprite = new Sprite(atlasRegion);
        sprite.setBounds(0.0f, 0.0f, atlasRegion.getRegionHeight(), atlasRegion.getRegionWidth());
        sprite.rotate90(true);
        return sprite;
    }

    public AtlasRegion addRegion(String str, Texture texture, int i, int i2, int i3, int i4) {
        this.textures.add(texture);
        AtlasRegion atlasRegion = new AtlasRegion(texture, i, i2, i3, i4);
        atlasRegion.name = str;
        this.regions.add(atlasRegion);
        return atlasRegion;
    }

    @Null
    public NinePatch createPatch(String str) {
        int i = this.regions.size;
        for (int i2 = 0; i2 < i; i2++) {
            AtlasRegion atlasRegion = this.regions.get(i2);
            if (atlasRegion.name.equals(str)) {
                int[] iArrFindValue = atlasRegion.findValue("split");
                if (iArrFindValue == null) {
                    throw new IllegalArgumentException(AbstractC3888ke0.i("Region does not have ninepatch splits: ", str));
                }
                NinePatch ninePatch = new NinePatch(atlasRegion, iArrFindValue[0], iArrFindValue[1], iArrFindValue[2], iArrFindValue[3]);
                int[] iArrFindValue2 = atlasRegion.findValue("pad");
                if (iArrFindValue2 != null) {
                    ninePatch.setPadding(iArrFindValue2[0], iArrFindValue2[1], iArrFindValue2[2], iArrFindValue2[3]);
                }
                return ninePatch;
            }
        }
        return null;
    }

    @Null
    public Sprite createSprite(String str) {
        int i = this.regions.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.regions.get(i2).name.equals(str)) {
                return newSprite(this.regions.get(i2));
            }
        }
        return null;
    }

    public Array<Sprite> createSprites() {
        Array<Sprite> array = new Array<>(true, this.regions.size, Sprite.class);
        int i = this.regions.size;
        for (int i2 = 0; i2 < i; i2++) {
            array.add(newSprite(this.regions.get(i2)));
        }
        return array;
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        ObjectSet.ObjectSetIterator<Texture> it = this.textures.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.textures.clear(0);
    }

    @Null
    public AtlasRegion findRegion(String str) {
        int i = this.regions.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.regions.get(i2).name.equals(str)) {
                return this.regions.get(i2);
            }
        }
        return null;
    }

    public Array<AtlasRegion> findRegions(String str) {
        Array<AtlasRegion> array = new Array<>(AtlasRegion.class);
        int i = this.regions.size;
        for (int i2 = 0; i2 < i; i2++) {
            AtlasRegion atlasRegion = this.regions.get(i2);
            if (atlasRegion.name.equals(str)) {
                array.add(new AtlasRegion(atlasRegion));
            }
        }
        return array;
    }

    public Array<AtlasRegion> getRegions() {
        return this.regions;
    }

    public ObjectSet<Texture> getTextures() {
        return this.textures;
    }

    public void load(TextureAtlasData textureAtlasData) {
        this.textures.ensureCapacity(textureAtlasData.pages.size);
        Array.ArrayIterator<TextureAtlasData.Page> it = textureAtlasData.pages.iterator();
        while (it.hasNext()) {
            TextureAtlasData.Page next = it.next();
            if (next.texture == null) {
                next.texture = new Texture(next.textureFile, next.format, next.useMipMaps);
            }
            next.texture.setFilter(next.minFilter, next.magFilter);
            next.texture.setWrap(next.uWrap, next.vWrap);
            this.textures.add(next.texture);
        }
        this.regions.ensureCapacity(textureAtlasData.regions.size);
        Array.ArrayIterator<TextureAtlasData.Region> it2 = textureAtlasData.regions.iterator();
        while (it2.hasNext()) {
            TextureAtlasData.Region next2 = it2.next();
            Texture texture = next2.page.texture;
            int i = next2.left;
            int i2 = next2.top;
            boolean z = next2.rotate;
            AtlasRegion atlasRegion = new AtlasRegion(texture, i, i2, z ? next2.height : next2.width, z ? next2.width : next2.height);
            atlasRegion.index = next2.index;
            atlasRegion.name = next2.name;
            atlasRegion.offsetX = next2.offsetX;
            atlasRegion.offsetY = next2.offsetY;
            atlasRegion.originalHeight = next2.originalHeight;
            atlasRegion.originalWidth = next2.originalWidth;
            atlasRegion.rotate = next2.rotate;
            atlasRegion.degrees = next2.degrees;
            atlasRegion.names = next2.names;
            atlasRegion.values = next2.values;
            if (next2.flip) {
                atlasRegion.flip(false, true);
            }
            this.regions.add(atlasRegion);
        }
    }

    public static class TextureAtlasData {
        final Array<Page> pages = new Array<>();
        final Array<Region> regions = new Array<>();

        public interface Field<T> {
            void parse(T t);
        }

        public static class Page {
            public Pixmap.Format format = Pixmap.Format.RGBA8888;
            public float height;
            public Texture.TextureFilter magFilter;
            public Texture.TextureFilter minFilter;
            public String name;
            public boolean pma;

            @Null
            public Texture texture;

            @Null
            public FileHandle textureFile;
            public Texture.TextureWrap uWrap;
            public boolean useMipMaps;
            public Texture.TextureWrap vWrap;
            public float width;

            public Page() {
                Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
                this.minFilter = textureFilter;
                this.magFilter = textureFilter;
                Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
                this.uWrap = textureWrap;
                this.vWrap = textureWrap;
            }
        }

        public static class Region {
            public int degrees;
            public boolean flip;
            public int height;
            public int index = -1;
            public int left;
            public String name;

            @Null
            public String[] names;
            public float offsetX;
            public float offsetY;
            public int originalHeight;
            public int originalWidth;
            public Page page;
            public boolean rotate;
            public int top;

            @Null
            public int[][] values;
            public int width;

            @Null
            public int[] findValue(String str) {
                String[] strArr = this.names;
                if (strArr == null) {
                    return null;
                }
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    if (str.equals(this.names[i])) {
                        return this.values[i];
                    }
                }
                return null;
            }
        }

        public TextureAtlasData() {
        }

        private static int readEntry(String[] strArr, @Null String str) {
            int iIndexOf;
            if (str == null) {
                return 0;
            }
            String strTrim = str.trim();
            if (strTrim.length() == 0 || (iIndexOf = strTrim.indexOf(58)) == -1) {
                return 0;
            }
            strArr[0] = strTrim.substring(0, iIndexOf).trim();
            int i = 1;
            int i2 = iIndexOf + 1;
            while (true) {
                int iIndexOf2 = strTrim.indexOf(44, i2);
                if (iIndexOf2 == -1) {
                    strArr[i] = strTrim.substring(i2).trim();
                    return i;
                }
                strArr[i] = strTrim.substring(i2, iIndexOf2).trim();
                i2 = iIndexOf2 + 1;
                if (i == 4) {
                    return 4;
                }
                i++;
            }
        }

        public Array<Page> getPages() {
            return this.pages;
        }

        public Array<Region> getRegions() {
            return this.regions;
        }

        public void load(FileHandle fileHandle, FileHandle fileHandle2, boolean z) {
            String str;
            String str2;
            final String[] strArr = new String[5];
            ObjectMap objectMap = new ObjectMap(15, 0.99f);
            objectMap.put("size", new Field<Page>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.1
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Page page) {
                    page.width = Integer.parseInt(strArr[1]);
                    page.height = Integer.parseInt(strArr[2]);
                }
            });
            objectMap.put("format", new Field<Page>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.2
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Page page) {
                    page.format = Pixmap.Format.valueOf(strArr[1]);
                }
            });
            objectMap.put("filter", new Field<Page>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.3
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Page page) {
                    page.minFilter = Texture.TextureFilter.valueOf(strArr[1]);
                    page.magFilter = Texture.TextureFilter.valueOf(strArr[2]);
                    page.useMipMaps = page.minFilter.isMipMap();
                }
            });
            objectMap.put("repeat", new Field<Page>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.4
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Page page) {
                    if (strArr[1].indexOf(120) != -1) {
                        page.uWrap = Texture.TextureWrap.Repeat;
                    }
                    if (strArr[1].indexOf(121) != -1) {
                        page.vWrap = Texture.TextureWrap.Repeat;
                    }
                }
            });
            objectMap.put("pma", new Field<Page>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.5
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Page page) {
                    page.pma = strArr[1].equals("true");
                }
            });
            int i = 0;
            boolean z2 = true;
            final boolean[] zArr = {false};
            ObjectMap objectMap2 = new ObjectMap(EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 0.99f);
            objectMap2.put("xy", new Field<Region>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.6
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Region region) {
                    region.left = Integer.parseInt(strArr[1]);
                    region.top = Integer.parseInt(strArr[2]);
                }
            });
            objectMap2.put("size", new Field<Region>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.7
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Region region) {
                    region.width = Integer.parseInt(strArr[1]);
                    region.height = Integer.parseInt(strArr[2]);
                }
            });
            objectMap2.put("bounds", new Field<Region>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.8
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Region region) {
                    region.left = Integer.parseInt(strArr[1]);
                    region.top = Integer.parseInt(strArr[2]);
                    region.width = Integer.parseInt(strArr[3]);
                    region.height = Integer.parseInt(strArr[4]);
                }
            });
            objectMap2.put(TypedValues.CycleType.S_WAVE_OFFSET, new Field<Region>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.9
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Region region) {
                    region.offsetX = Integer.parseInt(strArr[1]);
                    region.offsetY = Integer.parseInt(strArr[2]);
                }
            });
            objectMap2.put("orig", new Field<Region>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.10
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Region region) {
                    region.originalWidth = Integer.parseInt(strArr[1]);
                    region.originalHeight = Integer.parseInt(strArr[2]);
                }
            });
            objectMap2.put("offsets", new Field<Region>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.11
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Region region) {
                    region.offsetX = Integer.parseInt(strArr[1]);
                    region.offsetY = Integer.parseInt(strArr[2]);
                    region.originalWidth = Integer.parseInt(strArr[3]);
                    region.originalHeight = Integer.parseInt(strArr[4]);
                }
            });
            objectMap2.put("rotate", new Field<Region>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.12
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Region region) {
                    String str3 = strArr[1];
                    if (str3.equals("true")) {
                        region.degrees = 90;
                    } else if (!str3.equals("false")) {
                        region.degrees = Integer.parseInt(str3);
                    }
                    region.rotate = region.degrees == 90;
                }
            });
            objectMap2.put("index", new Field<Region>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.13
                @Override // com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field
                public void parse(Region region) {
                    int i2 = Integer.parseInt(strArr[1]);
                    region.index = i2;
                    if (i2 != -1) {
                        zArr[0] = true;
                    }
                }
            });
            BufferedReader erVar = fileHandle.reader(1024);
            try {
                try {
                    String line = erVar.readLine();
                    while (line != null) {
                        try {
                            if (line.trim().length() != 0) {
                                break;
                            } else {
                                line = erVar.readLine();
                            }
                        } catch (Exception e) {
                            e = e;
                            str = line;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error reading texture atlas file: ");
                            sb.append(fileHandle);
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = "\nLine: " + str;
                            }
                            sb.append(str2);
                            throw new GdxRuntimeException(sb.toString(), e);
                        }
                    }
                    while (line != null && line.trim().length() != 0 && readEntry(strArr, line) != 0) {
                        line = erVar.readLine();
                    }
                    Page page = null;
                    Array array = null;
                    Array array2 = null;
                    while (line != null) {
                        if (line.trim().length() == 0) {
                            line = erVar.readLine();
                            page = null;
                        } else if (page == null) {
                            page = new Page();
                            page.name = line;
                            page.textureFile = fileHandle2.child(line);
                            while (true) {
                                line = erVar.readLine();
                                if (readEntry(strArr, line) == 0) {
                                    break;
                                }
                                Field field = (Field) objectMap.get(strArr[i]);
                                if (field != null) {
                                    field.parse(page);
                                }
                            }
                            this.pages.add(page);
                        } else {
                            Region region = new Region();
                            region.page = page;
                            region.name = line.trim();
                            if (z) {
                                region.flip = z2;
                            }
                            while (true) {
                                line = erVar.readLine();
                                int entry = readEntry(strArr, line);
                                if (entry == 0) {
                                    break;
                                }
                                Field field2 = (Field) objectMap2.get(strArr[i]);
                                if (field2 != null) {
                                    field2.parse(region);
                                } else {
                                    if (array == null) {
                                        array = new Array(8);
                                        array2 = new Array(8);
                                    }
                                    array.add(strArr[i]);
                                    int[] iArr = new int[entry];
                                    while (i < entry) {
                                        int i2 = i + 1;
                                        try {
                                            iArr[i] = Integer.parseInt(strArr[i2]);
                                        } catch (NumberFormatException unused) {
                                        }
                                        i = i2;
                                    }
                                    array2.add(iArr);
                                }
                                i = 0;
                                z2 = true;
                            }
                            if (region.originalWidth == 0 && region.originalHeight == 0) {
                                region.originalWidth = region.width;
                                region.originalHeight = region.height;
                            }
                            if (array != null && array.size > 0) {
                                region.names = (String[]) array.toArray(String.class);
                                region.values = (int[][]) array2.toArray(int[].class);
                                array.clear();
                                array2.clear();
                            }
                            this.regions.add(region);
                        }
                    }
                    StreamUtils.closeQuietly(erVar);
                    if (zArr[i]) {
                        this.regions.sort(new Comparator<Region>() { // from class: com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.14
                            @Override // java.util.Comparator
                            public int compare(Region region2, Region region3) {
                                int i3 = region2.index;
                                if (i3 == -1) {
                                    i3 = Integer.MAX_VALUE;
                                }
                                int i4 = region3.index;
                                return i3 - (i4 != -1 ? i4 : Integer.MAX_VALUE);
                            }
                        });
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = null;
                }
            } catch (Throwable th) {
                StreamUtils.closeQuietly(erVar);
                throw th;
            }
        }

        public TextureAtlasData(FileHandle fileHandle, FileHandle fileHandle2, boolean z) {
            load(fileHandle, fileHandle2, z);
        }
    }

    @Null
    public Sprite createSprite(String str, int i) {
        int i2 = this.regions.size;
        for (int i3 = 0; i3 < i2; i3++) {
            AtlasRegion atlasRegion = this.regions.get(i3);
            if (atlasRegion.index == i && atlasRegion.name.equals(str)) {
                return newSprite(this.regions.get(i3));
            }
        }
        return null;
    }

    @Null
    public AtlasRegion findRegion(String str, int i) {
        int i2 = this.regions.size;
        for (int i3 = 0; i3 < i2; i3++) {
            AtlasRegion atlasRegion = this.regions.get(i3);
            if (atlasRegion.name.equals(str) && atlasRegion.index == i) {
                return atlasRegion;
            }
        }
        return null;
    }

    public TextureAtlas(String str) {
        this(Gdx.files.internal(str));
    }

    public Array<Sprite> createSprites(String str) {
        Array<Sprite> array = new Array<>(Sprite.class);
        int i = this.regions.size;
        for (int i2 = 0; i2 < i; i2++) {
            AtlasRegion atlasRegion = this.regions.get(i2);
            if (atlasRegion.name.equals(str)) {
                array.add(newSprite(atlasRegion));
            }
        }
        return array;
    }

    public TextureAtlas(FileHandle fileHandle) {
        this(fileHandle, fileHandle.parent());
    }

    public AtlasRegion addRegion(String str, TextureRegion textureRegion) {
        this.textures.add(textureRegion.texture);
        AtlasRegion atlasRegion = new AtlasRegion(textureRegion);
        atlasRegion.name = str;
        this.regions.add(atlasRegion);
        return atlasRegion;
    }

    public static class AtlasRegion extends TextureRegion {
        public int degrees;
        public int index;
        public String name;

        @Null
        public String[] names;
        public float offsetX;
        public float offsetY;
        public int originalHeight;
        public int originalWidth;
        public int packedHeight;
        public int packedWidth;
        public boolean rotate;

        @Null
        public int[][] values;

        public AtlasRegion(Texture texture, int i, int i2, int i3, int i4) {
            super(texture, i, i2, i3, i4);
            this.index = -1;
            this.originalWidth = i3;
            this.originalHeight = i4;
            this.packedWidth = i3;
            this.packedHeight = i4;
        }

        @Null
        public int[] findValue(String str) {
            String[] strArr = this.names;
            if (strArr == null) {
                return null;
            }
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (str.equals(this.names[i])) {
                    return this.values[i];
                }
            }
            return null;
        }

        @Override // com.badlogic.gdx.graphics.g2d.TextureRegion
        public void flip(boolean z, boolean z2) {
            super.flip(z, z2);
            if (z) {
                this.offsetX = (this.originalWidth - this.offsetX) - getRotatedPackedWidth();
            }
            if (z2) {
                this.offsetY = (this.originalHeight - this.offsetY) - getRotatedPackedHeight();
            }
        }

        public float getRotatedPackedHeight() {
            return this.rotate ? this.packedWidth : this.packedHeight;
        }

        public float getRotatedPackedWidth() {
            return this.rotate ? this.packedHeight : this.packedWidth;
        }

        public String toString() {
            return this.name;
        }

        public AtlasRegion(AtlasRegion atlasRegion) {
            this.index = -1;
            setRegion(atlasRegion);
            this.index = atlasRegion.index;
            this.name = atlasRegion.name;
            this.offsetX = atlasRegion.offsetX;
            this.offsetY = atlasRegion.offsetY;
            this.packedWidth = atlasRegion.packedWidth;
            this.packedHeight = atlasRegion.packedHeight;
            this.originalWidth = atlasRegion.originalWidth;
            this.originalHeight = atlasRegion.originalHeight;
            this.rotate = atlasRegion.rotate;
            this.degrees = atlasRegion.degrees;
            this.names = atlasRegion.names;
            this.values = atlasRegion.values;
        }

        public AtlasRegion(TextureRegion textureRegion) {
            this.index = -1;
            setRegion(textureRegion);
            this.packedWidth = textureRegion.getRegionWidth();
            int regionHeight = textureRegion.getRegionHeight();
            this.packedHeight = regionHeight;
            this.originalWidth = this.packedWidth;
            this.originalHeight = regionHeight;
        }
    }

    public TextureAtlas(FileHandle fileHandle, boolean z) {
        this(fileHandle, fileHandle.parent(), z);
    }

    public TextureAtlas(FileHandle fileHandle, FileHandle fileHandle2) {
        this(fileHandle, fileHandle2, false);
    }

    public TextureAtlas(FileHandle fileHandle, FileHandle fileHandle2, boolean z) {
        this(new TextureAtlasData(fileHandle, fileHandle2, z));
    }

    public TextureAtlas(TextureAtlasData textureAtlasData) {
        this.textures = new ObjectSet<>(4);
        this.regions = new Array<>();
        load(textureAtlasData);
    }

    public static class AtlasSprite extends Sprite {
        float originalOffsetX;
        float originalOffsetY;
        final AtlasRegion region;

        public AtlasSprite(AtlasRegion atlasRegion) {
            this.region = new AtlasRegion(atlasRegion);
            this.originalOffsetX = atlasRegion.offsetX;
            this.originalOffsetY = atlasRegion.offsetY;
            setRegion(atlasRegion);
            setOrigin(atlasRegion.originalWidth / 2.0f, atlasRegion.originalHeight / 2.0f);
            int regionWidth = atlasRegion.getRegionWidth();
            int regionHeight = atlasRegion.getRegionHeight();
            if (atlasRegion.rotate) {
                super.rotate90(true);
                super.setBounds(atlasRegion.offsetX, atlasRegion.offsetY, regionHeight, regionWidth);
            } else {
                super.setBounds(atlasRegion.offsetX, atlasRegion.offsetY, regionWidth, regionHeight);
            }
            setColor(1.0f, 1.0f, 1.0f, 1.0f);
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite, com.badlogic.gdx.graphics.g2d.TextureRegion
        public void flip(boolean z, boolean z2) {
            if (this.region.rotate) {
                super.flip(z2, z);
            } else {
                super.flip(z, z2);
            }
            float originX = getOriginX();
            float originY = getOriginY();
            AtlasRegion atlasRegion = this.region;
            float f = atlasRegion.offsetX;
            float f2 = atlasRegion.offsetY;
            float widthRatio = getWidthRatio();
            float heightRatio = getHeightRatio();
            AtlasRegion atlasRegion2 = this.region;
            atlasRegion2.offsetX = this.originalOffsetX;
            atlasRegion2.offsetY = this.originalOffsetY;
            atlasRegion2.flip(z, z2);
            AtlasRegion atlasRegion3 = this.region;
            float f3 = atlasRegion3.offsetX;
            this.originalOffsetX = f3;
            float f4 = atlasRegion3.offsetY;
            this.originalOffsetY = f4;
            float f5 = f3 * widthRatio;
            atlasRegion3.offsetX = f5;
            float f6 = f4 * heightRatio;
            atlasRegion3.offsetY = f6;
            translate(f5 - f, f6 - f2);
            setOrigin(originX, originY);
        }

        public AtlasRegion getAtlasRegion() {
            return this.region;
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public float getHeight() {
            return (super.getHeight() / this.region.getRotatedPackedHeight()) * this.region.originalHeight;
        }

        public float getHeightRatio() {
            return super.getHeight() / this.region.getRotatedPackedHeight();
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public float getOriginX() {
            return super.getOriginX() + this.region.offsetX;
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public float getOriginY() {
            return super.getOriginY() + this.region.offsetY;
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public float getWidth() {
            return (super.getWidth() / this.region.getRotatedPackedWidth()) * this.region.originalWidth;
        }

        public float getWidthRatio() {
            return super.getWidth() / this.region.getRotatedPackedWidth();
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public float getX() {
            return super.getX() - this.region.offsetX;
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public float getY() {
            return super.getY() - this.region.offsetY;
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void rotate90(boolean z) {
            super.rotate90(z);
            float originX = getOriginX();
            float originY = getOriginY();
            AtlasRegion atlasRegion = this.region;
            float f = atlasRegion.offsetX;
            float f2 = atlasRegion.offsetY;
            float widthRatio = getWidthRatio();
            float heightRatio = getHeightRatio();
            if (z) {
                AtlasRegion atlasRegion2 = this.region;
                atlasRegion2.offsetX = f2;
                atlasRegion2.offsetY = ((atlasRegion2.originalHeight * heightRatio) - f) - (atlasRegion2.packedWidth * widthRatio);
            } else {
                AtlasRegion atlasRegion3 = this.region;
                atlasRegion3.offsetX = ((atlasRegion3.originalWidth * widthRatio) - f2) - (atlasRegion3.packedHeight * heightRatio);
                atlasRegion3.offsetY = f;
            }
            AtlasRegion atlasRegion4 = this.region;
            translate(atlasRegion4.offsetX - f, atlasRegion4.offsetY - f2);
            setOrigin(originX, originY);
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void setBounds(float f, float f2, float f3, float f4) {
            AtlasRegion atlasRegion = this.region;
            float f5 = f3 / atlasRegion.originalWidth;
            float f6 = f4 / atlasRegion.originalHeight;
            float f7 = this.originalOffsetX * f5;
            atlasRegion.offsetX = f7;
            float f8 = this.originalOffsetY * f6;
            atlasRegion.offsetY = f8;
            boolean z = atlasRegion.rotate;
            super.setBounds(f + f7, f2 + f8, (z ? atlasRegion.packedHeight : atlasRegion.packedWidth) * f5, (z ? atlasRegion.packedWidth : atlasRegion.packedHeight) * f6);
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void setOrigin(float f, float f2) {
            AtlasRegion atlasRegion = this.region;
            super.setOrigin(f - atlasRegion.offsetX, f2 - atlasRegion.offsetY);
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void setOriginCenter() {
            float f = this.width / 2.0f;
            AtlasRegion atlasRegion = this.region;
            super.setOrigin(f - atlasRegion.offsetX, (this.height / 2.0f) - atlasRegion.offsetY);
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void setPosition(float f, float f2) {
            AtlasRegion atlasRegion = this.region;
            super.setPosition(f + atlasRegion.offsetX, f2 + atlasRegion.offsetY);
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void setSize(float f, float f2) {
            setBounds(getX(), getY(), f, f2);
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void setX(float f) {
            super.setX(f + this.region.offsetX);
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void setY(float f) {
            super.setY(f + this.region.offsetY);
        }

        public String toString() {
            return this.region.toString();
        }

        public AtlasSprite(AtlasSprite atlasSprite) {
            this.region = atlasSprite.region;
            this.originalOffsetX = atlasSprite.originalOffsetX;
            this.originalOffsetY = atlasSprite.originalOffsetY;
            set(atlasSprite);
        }
    }
}
