/*
 * Copyright (C) 2013-2022 Federico Iosue (federico@iosue.it)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.feio.android.omninotes.models.misc;

import java.util.HashMap;
import java.util.Map;

public class PlayStoreMetadataFetcherResult {
  private Map<String, String> playStoreMetadata;

  private PlayStoreMetadataFetcherResult(){
    playStoreMetadata = new HashMap<>();
    playStoreMetadata.put("datePublished", "");
    playStoreMetadata.put("fileSize", "");
    playStoreMetadata.put("numDownloads", "");
    playStoreMetadata.put("softwareVersion", "");
    playStoreMetadata.put("operatingSystems", "");
    playStoreMetadata.put("contentRating", "");
  }
  public String getData(String key){
    return playStoreMetadata.get(key);
  }

  public void setData(String key, String data){
    playStoreMetadata.put(key, data);
  }



