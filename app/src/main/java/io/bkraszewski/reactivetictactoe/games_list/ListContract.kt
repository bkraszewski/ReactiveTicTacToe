package io.bkraszewski.reactivetictactoe.games_list

import io.bkraszewski.reactivetictactoe.base.BasePresenter
import io.bkraszewski.reactivetictactoe.model.Game

interface ListContract {
    interface View {
        fun showGames(games: List<Game>)
        fun navigateToNewGame(mode: Int, game: Game? = null)

        companion object {
            val NULL = object : View {
                override fun navigateToNewGame(mode: Int, game: Game?) {
                }

                override fun showGames(games: List<Game>) {
                }
            }
        }
    }

    interface Presenter : BasePresenter {
        fun onCreateGame()
        fun onJoinGame(game: Game)
    }
}
