package musicPlaylistAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uidemo.R
import musicPlaylistModel.MusicPlaylist

class MusicAdapter(private val musicPlaylist: List<MusicPlaylist>) :
    RecyclerView.Adapter<MusicAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val musicView =
            LayoutInflater.from(parent.context).inflate(R.layout.music_playlist, parent, false)
        return ViewHolder(musicView)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val songsPlaylist = musicPlaylist[position]
        holder.bind(songsPlaylist)
    }

    override fun getItemCount(): Int = musicPlaylist.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val musicNameImage: ImageView = itemView.findViewById(R.id.music_name_image)
        private val musicName: TextView = itemView.findViewById(R.id.music_name)
        private val musicSingerName: TextView = itemView.findViewById(R.id.music_singer_name)

        fun bind(musicPlaylist: MusicPlaylist) {
            musicNameImage.setImageResource(musicPlaylist.musicNameImage)
            musicName.text = musicPlaylist.musicName
            musicSingerName.text = musicPlaylist.musicSingerName
        }
    }

}