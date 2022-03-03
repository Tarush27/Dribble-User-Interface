package com.example.uidemo

import android.os.Bundle
import android.text.Html.fromHtml
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import musicPlaylistAdapter.MusicAdapter
import musicPlaylistModel.MusicPlaylist

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userFollowerDetail: TextView = findViewById(R.id.user_follower_detail)
        userFollowerDetail.text = fromHtml(getString(R.string.userFollowerDetail))

        val userFollowingDetail: TextView = findViewById(R.id.user_following_detail)
        userFollowingDetail.text = fromHtml(getString(R.string.userFollowingDetail))

        val materialToolbar: MaterialToolbar = findViewById(R.id.mt_toolbar)
        setSupportActionBar(materialToolbar)


        val musicAlbumRecyclerView: RecyclerView = setUpMusicAlbumRecyclerView()
        val musicPlaylist = createMusicPlaylist()
        setMusicAdapter(musicPlaylist, musicAlbumRecyclerView)

    }

    private fun setMusicAdapter(
        musicPlaylist: List<MusicPlaylist>,
        musicAlbumRecyclerView: RecyclerView
    ) {
        val musicAdapter = MusicAdapter(musicPlaylist)
        musicAlbumRecyclerView.adapter = musicAdapter
    }

    private fun setUpMusicAlbumRecyclerView(): RecyclerView {
        val musicAlbumRecyclerView: RecyclerView = findViewById(R.id.music_album_rv)
        musicAlbumRecyclerView.setHasFixedSize(true)
        musicAlbumRecyclerView.layoutManager = LinearLayoutManager(this)
        return musicAlbumRecyclerView
    }

    private fun createMusicPlaylist(): List<MusicPlaylist> {
        val musicPlaylist = listOf(
            MusicPlaylist(
                R.drawable.psyco_music_image,
                getString(R.string.psyco_music_name_text_view),
                getString(R.string.psyco_music_singer_name)
            ),
            MusicPlaylist(
                R.drawable.at_my_worst_music_image,
                getString(R.string.at_my_worst_music_name_text_view),
                getString(R.string.at_my_worst_music_singer_name)
            ),
            MusicPlaylist(
                R.drawable.at_my_worst_music_image,
                getString(R.string.at_my_worst_music_name_text_view),
                getString(R.string.at_my_worst_music_singer_name)
            ),
            MusicPlaylist(
                R.drawable.psyco_music_image,
                getString(R.string.psyco_music_name_text_view),
                getString(R.string.psyco_music_singer_name)
            )

        )
        return musicPlaylist
    }


}
