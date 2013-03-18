/**
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.ushahidi.swiftriver.core.api.client.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;


/**
 * @author bmuita
 * 
 */
public class Drop {

	private String title;
	
	private String content;
	
	private String channel;
	
	@JsonProperty("source")
	private Identity identity;
	
	@JsonProperty("date_published")
	private String datePublished;
	
	@JsonProperty("original_url")
	private String originalUrl;
	
	@JsonProperty("original_id")
	private String originalId;
	
	private Media image;
	
	private List<Tag> tags;
	
	private List<Link> links;
	
	private List<Media> media;
	
	private List<Place> places;
	
	@JsonProperty("rivers")
	private List<Long> riverIds;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public String getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}

	public String getOriginalUrl() {
		return originalUrl;
	}

	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}

	public String getOriginalId() {
		return originalId;
	}

	public void setOriginalId(String originalId) {
		this.originalId = originalId;
	}

	public Media getImage() {
		return image;
	}

	public void setImage(Media image) {
		this.image = image;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public List<Media> getMedia() {
		return media;
	}

	public void setMedia(List<Media> media) {
		this.media = media;
	}

	public List<Place> getPlaces() {
		return places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}

	public List<Long> getRiverIds() {
		return riverIds;
	}

	public void setRiverIds(List<Long> riverIds) {
		this.riverIds = riverIds;
	}

	public static class Identity {
		
		private String name;
		
		private String username;
		
		private String avatar;
		
		@JsonProperty("origin_id")
		private String originId;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getAvatar() {
			return avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		public String getOriginId() {
			return originId;
		}

		public void setOriginId(String originId) {
			this.originId = originId;
		}
		
	}
	
	public static class Bucket {
		
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
	
	public static class Tag {
		
		private String tag;
		
		private String type;

		public String getTag() {
			return tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}
	
	public static class Link {
		
		private String url;

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}
	
	public static class Media {
		
		private String url;
		
		private String type;
		
		private List<MediaThumbnail> thumbnails;

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		public List<MediaThumbnail> getThumbnails() {
			return thumbnails;
		}

		public void setThumbnails(List<MediaThumbnail> thumbnails) {
			this.thumbnails = thumbnails;
		}

		public static class MediaThumbnail {
			
			private int size;
			
			private String url;

			public int getSize() {
				return size;
			}

			public void setSize(int size) {
				this.size = size;
			}

			public String getUrl() {
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
			
		}
	}
	
	public static class Place {
		
		private String type;
		
		private String name;
		
		private float longitude;
		
		private float latitude;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getLongitude() {
			return longitude;
		}

		public void setLongitude(float longitude) {
			this.longitude = longitude;
		}

		public float getLatitude() {
			return latitude;
		}

		public void setLatitude(float latitude) {
			this.latitude = latitude;
		}
	}
}
