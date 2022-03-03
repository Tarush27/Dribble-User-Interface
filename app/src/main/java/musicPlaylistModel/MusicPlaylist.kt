package musicPlaylistModel

import androidx.annotation.DrawableRes

data class MusicPlaylist(
    @DrawableRes val musicNameImage: Int,
    val musicName: String,
    val musicSingerName: String
) {

}