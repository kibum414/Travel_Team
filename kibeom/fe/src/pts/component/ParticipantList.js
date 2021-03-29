import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import axios from 'axios'
import '../css/List.css'

const ParticipantList = () => {

  const [list, setList] = useState([])

  const getList = () => {
    axios.get(`http://localhost:8080/participants/list`)
      .then(res => {
        console.log(res)
        setList(res.data)
      })
      .catch(err => {
        console.log(err)
      })
  }

  useEffect(() => {
    console.log('getList')

    getList()
  }, [])

  return (
    <>
      <table>
        <thead>
          <tr>
            <th>번호</th>
            <th>이름</th>
            <th>신청일</th>
          </tr>
        </thead>
        <tbody>
          {
            list.map(participant =>
              <tr>
                <Link to={`/participants/list/${participant.participantNo}`}>
                  <td key={participant.participantNo}>{participant.participantNo}</td>
                  <td>{participant.name}</td>
                  <td>{participant.regdate}</td>
                </Link>
              </tr>
            )
          }
        </tbody>
      </table>
    </>
  )
}

export default ParticipantList